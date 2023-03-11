package br.ada.americanas.moviesbattle.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/app/players")
public class PlayerAppControler {
    private PlayerService service;

    @Autowired
    public PlayerAppControler(PlayerService service){
        this.service = service;
    }

    @GetMapping
    public String get(Model model){
        model.addAttribute("players",service.list());
        return "player/list";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("player",new Player());
        return "player/form";
    }
    @PostMapping
    public String save(@ModelAttribute Player player){
        if (player.getId()==null){
            player.setScore(0.0F);
        }
        service.add(player);
        return "redirect:/app/players";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id,Model model){
        Optional<Player> player = service.findById(id);
        model.addAttribute("player",player);
        return "player/form";
    }

    @GetMapping("/delete/{id}")
    public String delete(
            @PathVariable("id") Long id,
            Model model
    ){
        service.delete(id);
        return "redirect:/app/players";
    }

}

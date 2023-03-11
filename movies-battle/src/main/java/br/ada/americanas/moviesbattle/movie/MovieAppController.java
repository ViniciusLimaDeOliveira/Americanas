package br.ada.americanas.moviesbattle.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Controller
@RequestMapping("/app/movies")
public class MovieAppController {
    private MovieService service;

    @Autowired
    public MovieAppController(MovieService service){
        this.service = service;
    }

    @GetMapping
    public String get(Model model){
        model.addAttribute("movies",service.list());
        return "movie/list";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("movie",new Movie());
        return "movie/form";
    }
    @PostMapping
    public String save(@ModelAttribute Movie movie){
        service.add(movie);
        return "redirect:/app/movies";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id,Model model){
        Optional<Movie> movie = service.findById(id);
        model.addAttribute("movie",movie);
        return "movie/form";
    }

    @GetMapping("/delete/{id}")
    public String delete(
            @PathVariable("id") Long id,
            Model model
    ){
        service.delete(id);
        return "redirect:/app/movies";
    }
}

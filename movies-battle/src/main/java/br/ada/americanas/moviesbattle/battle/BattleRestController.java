package br.ada.americanas.moviesbattle.battle;

import br.ada.americanas.moviesbattle.movie.Movie;
import br.ada.americanas.moviesbattle.player.Player;
import br.ada.americanas.moviesbattle.player.PlayerAppControler;
import br.ada.americanas.moviesbattle.player.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/battles")
public class BattleRestController {
    private BattleService battleService;
    private PlayerService playerService;

    @Autowired
    public BattleRestController(BattleService battleService,PlayerService playerService) {
        this.battleService = battleService;
        // Manter o playerService para compatibilidade com o App Controler?
        this.playerService = playerService;
    }

    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public Battle create(@RequestBody Player player) {
        Player player_banco = this.playerService.findById(player.getId()).get();
        return this.battleService.create(player_banco);
    }

    @GetMapping(
            value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public Battle get(@PathVariable("id") Long id) {
        Battle battle = battleService.find(id).get();
        System.out.println(battle);
        return battle;
    }

    @PutMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public Boolean answer(
            @PathVariable("id") Long id,
            @RequestBody Movie movie
    ) {
        Battle battle = battleService.find(id).get();
        battleService.answer(battle, movie);
        boolean resposta = battle.getHit();
        return resposta;
        // IF ternario
        //return hit ? "battle/congrats" : "battle/wasted";
        // se for hit retorna True ,e se nao for retorna False;
    }
    // O banco tem que tar com Players validos, e no casso cadastrei sem querer 2 batalhas com um player que tinha sido excluido
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Battle> list() {
        return this.battleService.list();
    }

    @DeleteMapping(
            value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public Battle delete(@PathVariable("id") Long id) {
        return battleService.delete(id);
    }

}

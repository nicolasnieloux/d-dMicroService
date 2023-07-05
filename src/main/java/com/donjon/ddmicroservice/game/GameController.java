package com.donjon.ddmicroservice.game;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class GameController {
    private final GameInterface gameInterface;

    public GameController(GameInterface gameInterface){
        this.gameInterface = gameInterface;
    }
    private int idCount;

    @GetMapping("/game")
    public List<GameEntity> getGame() {


        return games;
    }

    @DeleteMapping("/game/{id}")
    public void deleteGame(@PathVariable("id") int id) {

        gameInterface.delete(id);
    }
    @GetMapping("/game/{id}")

    public Optional<GameEntity> findById(@PathVariable int id){
        return gameInterface.findById(id);
    }



}

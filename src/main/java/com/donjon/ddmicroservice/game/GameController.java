package com.donjon.ddmicroservice.game;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameController {
    private final GameService gameService ;

    public GameController(GameService gameService){
        this.gameService = gameService;
    }


    @GetMapping("/game")
    public ResponseEntity<List<GameDto>> getGames() {
        List<GameDto> games = gameService.getAllGames();
        return new ResponseEntity<>(games, HttpStatus.OK);
    }

//    @DeleteMapping("/game/{id}")
//    public void deleteGame(@PathVariable("id") int id) {
//
//        gameInterface.delete(id);
//    }
//    @GetMapping("/game/{id}")
//
//    public Optional<GameEntity> findById(@PathVariable int id){
//        return gameInterface.findById(id);
//    }



}

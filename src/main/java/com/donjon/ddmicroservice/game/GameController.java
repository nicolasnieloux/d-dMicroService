package com.donjon.ddmicroservice.game;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class GameController {
    private final GameService gameService ;

    public GameController(GameService gameService){
        this.gameService = gameService;
    }


    @GetMapping("/game")
    public List<GameEntity> getGames() {
        return gameService.getAllGames();
    }
    @GetMapping("/game/{id}")
        public GameEntity getGameById(@PathVariable int id) {
            return gameService.getGameById(id);
        }

    @PostMapping("/game")
    public GameDto createGame(@RequestBody GameDto gameDto){
        String name = gameDto.getName();
        String type = gameDto.getType();
        int hp = gameDto.getHp();
        long idPlayer = gameDto.getIdPlayer();
        GameDto newGame = new GameDto(idPlayer, name, type, hp);

        HttpHeaders headersPersonnage = new HttpHeaders();
        headersPersonnage.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplatePersonnage = new RestTemplate();

        HttpEntity<GameDto> request = new HttpEntity<>(newGame, headersPersonnage);
//        ResponseEntity<GameDto> responseCharacter = restTemplatePersonnage.postForEntity("http://character", request , GameDto.class);
//        newGame.setIdPersonnage(responseCharacter.getBody().getIdPersonnage());
        newGame.setIdPersonnage(123);

        HttpHeaders headersBoard = new HttpHeaders();
        headersBoard.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplateBoard = new RestTemplate();

        GameDto newBoard = new GameDto(idPlayer);
        HttpEntity<GameDto> requestBoard = new HttpEntity<>(newBoard, headersBoard);
//        ResponseEntity<GameDto> responseBoard = restTemplateBoard.postForEntity("http://board", requestBoard , GameDto.class);
//        newGame.setIdBoard(responseBoard.getBody().getIdBoard());
        newGame.setIdBoard(321);

        GameEntity gameEntity = new GameEntity();
        gameEntity.setId_board(newGame.getIdBoard());
        gameEntity.setId_player(newGame.getIdPlayer());
        gameEntity.setId_personnage(newGame.getIdPersonnage());
        GameEntity createdGame = gameService.createGame(gameEntity);
        newGame.setId(createdGame.getId());

        return newGame;
    }

    @DeleteMapping("/game/{id}")
    public void deleteGame(@PathVariable("id") int id) {
//        RestTemplate restTemplate = new RestTemplate();
//        restTemplate.delete("http://character/" + id);
//        restTemplate.delete("http://board/" + id);
        gameService.deleteGame(id);
    }

//    @GetMapping("/game/{id}")
//    public Optional<GameEntity> findById(@PathVariable int id){
//        return gameService.findById(id);
//    }

}

package com.donjon.ddmicroservice.game;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    private final GameRepository games;

    public GameService(GameRepository games) {
        this.games = games;
    }

    public List<GameEntity> getGame(){

        return games.findAll();

    }
    public void deleteGame(long id){
        GameEntity gameEntity = games.findById(id).orElse(null);

        if (gameEntity==null){
            return ;
        }
        RestTemplate restTemplate = new RestTemplate();

        try {
            restTemplate.delete("http://character/" + gameEntity.getId_personnage());
        }catch (E)

        restTemplate.delete("http://board/" + gameEntity.getId_board());

        games.deleteById(id);

    }
}

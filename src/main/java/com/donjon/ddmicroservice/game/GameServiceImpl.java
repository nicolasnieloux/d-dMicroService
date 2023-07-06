package com.donjon.ddmicroservice.game;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class GameServiceImpl implements GameService {

private final GameRepository gameRepository;

    public GameServiceImpl(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    public GameDto createGame(GameDto gameDto) {
        return null;
    }

    @Override
    public GameEntity getGameById(long gameId) {
        GameEntity optionalGame = gameRepository.findById(gameId).orElse(null);
        return optionalGame;
    }

    @Override
    public List<GameEntity> getAllGames() {
        return gameRepository.findAll();
    }


    @Override
    public GameEntity createGame(GameEntity gameEntity){
        gameRepository.save(gameEntity);
        return gameEntity;
    }

    @Override
    public boolean existById(long id){
        return gameRepository.existsById(id);
    }

    @Override
    public void deleteGame(long gameId) {
        gameRepository.deleteById(gameId);
    }
}

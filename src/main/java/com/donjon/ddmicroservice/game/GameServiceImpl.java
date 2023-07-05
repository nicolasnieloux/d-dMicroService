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
    public GameDto getGameById(long gameId) {
        Optional<GameEntity> optionalGame = gameRepository.findById(gameId);
        GameEntity game = optionalGame.get();
        return GameMapper.mapToGameDto(game);
    }

    @Override
    public List<GameDto> getAllGames() {
        List<GameEntity> games = gameRepository.findAll();
        return null;
    }

    @Override
    public void deleteGame(long gameId) {

    }
}

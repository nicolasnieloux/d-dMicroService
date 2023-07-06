package com.donjon.ddmicroservice.game;

public class GameMapper {
    public static GameDto mapToGameDto (GameEntity game){
        GameDto gameDto = new GameDto(
                game.getId(),
                game.getId_personnage()
        );
        return gameDto;
    }


    public static GameEntity mapToGameEntity (GameDto gameDto){
        GameEntity gameEntity = new GameEntity(
                gameDto.getId(),
                gameDto.getIdPersonnage(),
                gameDto.getIdBoard(),
                gameDto.getIdPlayer()
        );
        return gameEntity;
    }
}

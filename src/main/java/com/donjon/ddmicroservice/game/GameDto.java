package com.donjon.ddmicroservice.game;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GameDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long idPersonnage;
    private long idPlayer;
    private long idBoard;
    private String name;
    private String type;
    private int hp;

    public GameDto(long idPlayer) {
        this.idPlayer = idPlayer;
    }

    public GameDto(long id, long idPersonnage) {
        this.id=id;
        this.idPersonnage=idPersonnage;
    }

    public GameDto(String name, String type, int hp) {
        this.name = name;
        this.type = type;
        this.hp = hp;
    }

    public GameDto(long idPlayer, String name, String type, int hp) {
        this.idPlayer = idPlayer;
        this.name = name;
        this.type = type;
        this.hp = hp;
    }

    public GameDto() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(long idPlayer) {
        this.idPlayer = idPlayer;
    }

    public long getIdPersonnage() {
        return idPersonnage;
    }

    public void setIdPersonnage(long idPersonnage) {
        this.idPersonnage = idPersonnage;
    }

    public long getIdBoard() {
        return idBoard;
    }

    public void setIdBoard(long idBoard) {
        this.idBoard = idBoard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}

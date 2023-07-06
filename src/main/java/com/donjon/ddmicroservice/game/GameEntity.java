package com.donjon.ddmicroservice.game;

import jakarta.persistence.*;

@Entity
@Table (name = "donjon")
public class GameEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long id_player;

//    @Column(unique = true)
    private long id_board;
//    @Column(unique = true)
    private long id_personnage;

    public GameEntity() {
    }

    public GameEntity(long id, long idPersonnage) {
        this.id=id;
        this.id_personnage=idPersonnage;
    }

    public GameEntity(long id, long idPersonnage, long idBoard, long idPlayer) {
        this.id = id;
        this.id_personnage = idPersonnage;
        this.id_board = idBoard;
        this.id_player = idPlayer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId_player() {
        return id_player;
    }

    public void setId_player(long id_player) {
        this.id_player = id_player;
    }

    public long getId_board() {
        return id_board;
    }

    public void setId_board(long id_board) {
        this.id_board = id_board;
    }

    public long getId_personnage() {
        return id_personnage;
    }

    public void setId_personnage(long id_personnage) {
        this.id_personnage = id_personnage;
    }
}


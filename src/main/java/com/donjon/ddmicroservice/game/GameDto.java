package com.donjon.ddmicroservice.game;

public class GameDto {
    private long id;

    private long idPersonnage;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdPersonnage() {
        return idPersonnage;
    }

    public void setIdPersonnage(long idPersonnage) {
        this.idPersonnage = idPersonnage;
    }

    public GameDto(long id, long idPersonnage) {
        this.id=id;
        this.idPersonnage=idPersonnage;
    }
}

package com.utn.ParcialLaboV.model;

public enum TipoPersona {

    REPRESENTANTE("representante"),
    JUGADOR("jugador");

    private String description;

    TipoPersona(String description){
        this.description = description;
    }

    public static TipoPersona find(final String value){
        for (TipoPersona v : values()){
            if(v.toString().equalsIgnoreCase(value)){
                return v;
            }
        }
        throw new IllegalArgumentException(String.format("Invalid TipoPersona: %s", value));
    }

    public String getDescription(){
        return description;
    }

}

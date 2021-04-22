package com.utn.ParcialLaboV.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Representante extends Persona{

    //Peso de la boveda en gramos
    private double PesoDeLaBoveda;

    private double MontoTotal;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Jugador> jugadores;

    @Override
    public TipoPersona tipoPersona(){
        return TipoPersona.REPRESENTANTE;
    }

    public double getPesoDeLaBoveda() {
        return MontoTotal/100;
    }

    public double getMontoTotal(){
        double tot = 0;
        for (Jugador j:jugadores) {
            tot = tot + j.getCurrency().getMonto();
        }
        return tot;
    }
}

package com.utn.ParcialLaboV.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
public class Representante extends Persona{

    //Peso de la boveda en gramos
    private double PesoDeLaBoveda;

    private double MontoTotal;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Jugador> jugadores;

    public double getPesoDeLaBoveda() {
        return MontoTotal;
    }

    public double getMontoTotal(){
        double tot = 0;
        for (Jugador j:jugadores) {
            tot = tot + j.getCurrency().getMonto();
        }
        return tot;
    }
}

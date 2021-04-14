package com.utn.ParcialLaboV.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
public class Jugador extends Persona{

    private double peso;
    private double altura;
    private Integer goles;
    private double minutosJugados;

    @OneToOne
    private CurrencyDolar currency;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date fechaDeNacimiento;

}

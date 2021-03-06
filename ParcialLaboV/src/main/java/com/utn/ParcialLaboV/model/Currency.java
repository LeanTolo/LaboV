package com.utn.ParcialLaboV.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.AccessType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Currency {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "el valor del monto no puede ser nulo")
    private double monto;

    @AccessType(AccessType.Type.PROPERTY)
    public abstract CurrencyType currencyType();

    public double getMonto() {
        double mont = 0;
        mont = this.monto * currencyType().getPrecio();
        return mont;
    }
}

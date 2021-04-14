package com.utn.ParcialLaboV.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Persona {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "el nombre no puede ser nulo")
    private String name;

    @NotNull(message = "el apellido no puede ser nulo")
    private String lastName;

}

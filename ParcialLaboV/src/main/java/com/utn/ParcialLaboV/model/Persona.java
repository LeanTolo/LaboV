package com.utn.ParcialLaboV.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;
import org.springframework.data.annotation.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "tipoPersona", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Representante.class, name = "REPRESENTANTE"),
        @JsonSubTypes.Type(value = Jugador.class, name = "JUGADOR"),
})
@Entity
public abstract class Persona {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "el nombre no puede ser nulo")
    private String name;

    @NotNull(message = "el apellido no puede ser nulo")
    private String lastName;

    @AccessType(AccessType.Type.PROPERTY)
    public abstract TipoPersona tipoPersona();

}

package com.utn.ParcialLaboV.service.interfaces;

import com.utn.ParcialLaboV.model.Jugador;
import com.utn.ParcialLaboV.model.Persona;
import com.utn.ParcialLaboV.model.Representante;

import java.util.List;

public interface IPersonaService {
    public void add(Persona persona);
    public List<Persona> getAll();
    public Persona getById(Long id);
    public void delete(Long id);
    public void addJugador (Long idRepresentante, Long idJugador);
    public List<Jugador> getAllJugadoresDeRepresentante(Long idRepresentante);
}

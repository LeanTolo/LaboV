package com.utn.ParcialLaboV.service.interfaces;

import com.utn.ParcialLaboV.model.Jugador;
import com.utn.ParcialLaboV.model.Persona;
import com.utn.ParcialLaboV.model.Representante;

import java.util.List;

public interface IRepresentanteService {
    public void add(Representante representante);
    public List<Representante> getAll();
    public Representante getById(Long id);
    public void addJugadorToRepresentante(Long id,Long idJugador);
    public void delete(Long id);
    public List<Jugador> getJugadoresRep(Long representanteId);
}

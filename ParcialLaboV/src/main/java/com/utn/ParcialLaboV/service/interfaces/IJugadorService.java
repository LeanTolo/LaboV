package com.utn.ParcialLaboV.service.interfaces;

import com.utn.ParcialLaboV.model.Jugador;
import com.utn.ParcialLaboV.model.Representante;

import java.util.List;

public interface IJugadorService {
    public void add(Jugador jugador);
    public List<Jugador> getAll();
    public Jugador getById(Long id);
    public void delete(Long id);
}

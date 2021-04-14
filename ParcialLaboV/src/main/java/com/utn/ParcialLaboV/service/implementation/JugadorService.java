package com.utn.ParcialLaboV.service.implementation;

import com.utn.ParcialLaboV.model.Jugador;
import com.utn.ParcialLaboV.repository.IJugadorRepository;
import com.utn.ParcialLaboV.repository.IPersonaRepository;
import com.utn.ParcialLaboV.service.interfaces.IJugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@Service
public class JugadorService implements IJugadorService {

    private final IJugadorRepository jugadorRepository;

    @Autowired
    public JugadorService(IJugadorRepository jugadorRepository){
        this.jugadorRepository = jugadorRepository;
    }

    @Override
    public void add(Jugador jugador) {
        jugadorRepository.save(jugador);
    }

    @Override
    public List<Jugador> getAll() {
        return jugadorRepository.findAll();
    }

    @Override
    public Jugador getById(Long id) {
        return jugadorRepository.findById(id).orElseThrow(
                ()-> new HttpClientErrorException(HttpStatus.NOT_FOUND)
        );
    }

    @Override
    public void delete(Long id) {
        jugadorRepository.deleteById(id);
    }
}

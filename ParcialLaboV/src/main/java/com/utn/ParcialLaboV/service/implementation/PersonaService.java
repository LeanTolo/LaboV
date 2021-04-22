package com.utn.ParcialLaboV.service.implementation;


import com.utn.ParcialLaboV.model.Jugador;
import com.utn.ParcialLaboV.model.Persona;
import com.utn.ParcialLaboV.model.Representante;
import com.utn.ParcialLaboV.repository.IPersonaRepository;
import com.utn.ParcialLaboV.service.interfaces.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {

    private final IPersonaRepository personaRepository;

    @Autowired
    public PersonaService(IPersonaRepository personaRepository){
        this.personaRepository = personaRepository;
    }

    @Override
    public void add(Persona persona) {
        personaRepository.save(persona);
    }


    @Override
    public List<Persona> getAll() {
        return personaRepository.findAll();
    }


    @Override
    public Persona getById(Long id) {
        return personaRepository.findById(id).orElseThrow(
                () -> new HttpClientErrorException(HttpStatus.NOT_FOUND)
        );
    }

    @Override
    public void delete(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public void addJugador(Long idRepresentante, Long idJugador) {
        Jugador jugador;
        Representante representante;
        jugador = (Jugador)getById(idJugador);
        representante = (Representante)getById(idRepresentante);
        representante.getJugadores().add(jugador);
        representante.setMontoTotal(representante.getMontoTotal());
        representante.setPesoDeLaBoveda(representante.getPesoDeLaBoveda() + jugador.getCurrency().getMonto());
        personaRepository.save(representante);
    }

    @Override
    public List<Jugador> getAllJugadoresDeRepresentante(Long idRepresentante) {
        Representante representante = (Representante) this.getById(idRepresentante);
        return representante.getJugadores();
    }

}

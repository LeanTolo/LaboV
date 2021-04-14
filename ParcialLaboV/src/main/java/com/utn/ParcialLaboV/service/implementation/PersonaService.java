package com.utn.ParcialLaboV.service.implementation;


import com.utn.ParcialLaboV.model.Jugador;
import com.utn.ParcialLaboV.model.Persona;
import com.utn.ParcialLaboV.model.Representante;
import com.utn.ParcialLaboV.repository.IPersonaRepository;
import com.utn.ParcialLaboV.service.interfaces.IPersonaService;
import org.apache.catalina.Manager;
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

}

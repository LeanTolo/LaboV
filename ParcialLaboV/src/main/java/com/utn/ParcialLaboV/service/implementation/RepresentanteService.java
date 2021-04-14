package com.utn.ParcialLaboV.service.implementation;

import com.utn.ParcialLaboV.model.Jugador;
import com.utn.ParcialLaboV.model.Representante;
import com.utn.ParcialLaboV.repository.IJugadorRepository;
import com.utn.ParcialLaboV.repository.IRepresentanteRepository;
import com.utn.ParcialLaboV.service.interfaces.IJugadorService;
import com.utn.ParcialLaboV.service.interfaces.IRepresentanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@Service
public class RepresentanteService implements IRepresentanteService {

    private final IRepresentanteRepository representanteRepository;
    private final IJugadorService jugadorService;

    @Autowired
    public RepresentanteService(IRepresentanteRepository representanteRepository,IJugadorService jugadorService){
        this.representanteRepository = representanteRepository;
        this.jugadorService = jugadorService;
    }

    @Override
    public void add(Representante representante) {
        representanteRepository.save(representante);
    }

    @Override
    public List<Representante> getAll() {
        return representanteRepository.findAll();
    }

    @Override
    public Representante getById(Long id) {
        return representanteRepository.findById(id).orElseThrow(
                ()->new HttpClientErrorException(HttpStatus.NOT_FOUND)
        );
    }

    @Override
    public void addJugadorToRepresentante(Long id, Long idJugador) {
        Representante rep = this.getById(id);
        Jugador jugador = jugadorService.getById(idJugador);
        rep.getJugadores().add(jugador);
        representanteRepository.save(rep);
    }

    @Override
    public void delete(Long id) {
        representanteRepository.deleteById(id);
    }

    @Override
    public List<Jugador> getJugadoresRep(Long representanteId) {
        Representante rep = this.getById(representanteId);
        return rep.getJugadores();
    }
}

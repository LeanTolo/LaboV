package com.utn.ParcialLaboV.controller;

import com.utn.ParcialLaboV.model.Jugador;
import com.utn.ParcialLaboV.model.Representante;
import com.utn.ParcialLaboV.service.implementation.RepresentanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/representante")
public class RepresentanteController {

    private final RepresentanteService representanteService;

    @Autowired
    public RepresentanteController(RepresentanteService representanteService){
        this.representanteService = representanteService;
    }

    @PostMapping
    public void add(@RequestBody Representante representante){
        representanteService.add(representante);
    }

    @GetMapping
    public List<Representante> getAll(){
        return representanteService.getAll();
    }

    @GetMapping("/{representanteId}")
    public Representante getById(@PathVariable Long representanteId){
        return representanteService.getById(representanteId);
    }

    @GetMapping("/listPlayers/{representanteId}")
    public List<Jugador> getAllJugadores(@PathVariable Long representanteId){
        return representanteService.getJugadoresRep(representanteId);
    }

    @DeleteMapping("/{representanteId}")
    public void delete(@PathVariable Long representanteId){
        representanteService.delete(representanteId);
    }

    @PutMapping("/{representanteId}/jugadores/{jugadorId}")
    public void delete(@PathVariable Long representanteId,@PathVariable Long jugadorId){
        representanteService.addJugadorToRepresentante(representanteId,jugadorId);
    }


}

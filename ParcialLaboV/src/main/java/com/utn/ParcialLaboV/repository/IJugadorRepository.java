package com.utn.ParcialLaboV.repository;

import com.utn.ParcialLaboV.model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJugadorRepository extends JpaRepository<Jugador,Long> {
}

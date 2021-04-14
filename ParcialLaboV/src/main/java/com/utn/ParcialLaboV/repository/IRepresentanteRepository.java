package com.utn.ParcialLaboV.repository;

import com.utn.ParcialLaboV.model.Representante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepresentanteRepository extends JpaRepository<Representante,Long> {
}

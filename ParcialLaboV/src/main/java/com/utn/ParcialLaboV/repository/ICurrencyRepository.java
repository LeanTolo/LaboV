package com.utn.ParcialLaboV.repository;

import com.utn.ParcialLaboV.model.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICurrencyRepository extends JpaRepository<Currency,Long> {
}

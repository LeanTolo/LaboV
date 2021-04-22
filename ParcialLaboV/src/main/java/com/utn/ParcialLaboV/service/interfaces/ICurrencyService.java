package com.utn.ParcialLaboV.service.interfaces;

import com.utn.ParcialLaboV.model.Currency;
import com.utn.ParcialLaboV.model.Persona;

import java.util.List;

public interface ICurrencyService {
    public void add(Currency currency);
    public List<Currency> getAll();
    public Currency getById(Long id);
    public void delete(Currency currency);
}

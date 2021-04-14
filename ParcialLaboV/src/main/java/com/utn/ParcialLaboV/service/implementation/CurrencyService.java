package com.utn.ParcialLaboV.service.implementation;

import com.utn.ParcialLaboV.model.Currency;
import com.utn.ParcialLaboV.repository.ICurrencyRepository;
import com.utn.ParcialLaboV.repository.IPersonaRepository;
import com.utn.ParcialLaboV.service.interfaces.ICurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@Service
public class CurrencyService implements ICurrencyService {

    private final ICurrencyRepository currencyRepository;

    @Autowired
    public CurrencyService(ICurrencyRepository currencyRepository){
        this.currencyRepository = currencyRepository;
    }

    @Override
    public void add(Currency currency) {
        currencyRepository.save(currency);
    }

    @Override
    public List<Currency> getAll() {
        return currencyRepository.findAll();
    }

    @Override
    public Currency getById(Long id) {
        return currencyRepository.findById(id).orElseThrow(
                () -> new HttpClientErrorException(HttpStatus.NOT_FOUND)
        );
    }

    @Override
    public void delete(Long id) {
        currencyRepository.deleteById(id);
    }
}

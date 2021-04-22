package com.utn.ParcialLaboV.controller;

import com.utn.ParcialLaboV.model.Currency;
import com.utn.ParcialLaboV.service.implementation.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/currency")
public class CurrencyController {

    private final CurrencyService currencyService;

    @Autowired
    public CurrencyController(CurrencyService currencyService){
        this.currencyService = currencyService;
    }

    @PostMapping("")
    public void add(@RequestBody Currency currency){
        currencyService.add(currency);
    }

    @GetMapping("")
    public List<Currency> getAll(){
        return currencyService.getAll();
    }

    @GetMapping("/{currencyId}")
    public Currency getById(@PathVariable Long currencyId){
        return currencyService.getById(currencyId);
    }

    @DeleteMapping("")
    public void delete(@RequestBody Currency currency){
        currencyService.delete(currency);
    }

}

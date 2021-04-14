package com.utn.ParcialLaboV.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@Entity
@NoArgsConstructor
public class CurrencyEuro extends Currency{

    @Override
    public CurrencyType currencyType() {
        return CurrencyType.EURO;
    }
}

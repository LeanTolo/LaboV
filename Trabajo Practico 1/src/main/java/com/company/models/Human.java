package com.company.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Human {

    public String Name;
    public Integer Age;
    public Integer Weight;
    public Integer AlcoholInBlood;

}

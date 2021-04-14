package com.utn.ParcialLaboV.model;

public enum CurrencyType {

    EURO("Euro",200),
    DOLAR("Dolar",150);

    private String nombre;
    private double precio;

    CurrencyType(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public static CurrencyType find(final String value) {
        for (CurrencyType v : values()) {
            if (v.toString().equalsIgnoreCase(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException(String.format("Invalid Currency: %s", value));
    }

    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }

}

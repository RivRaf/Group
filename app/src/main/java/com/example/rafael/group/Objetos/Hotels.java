package com.example.rafael.group.Objetos;

/**
 * Created by RAFAEL on 01/03/2017.
 */

public class Hotels {
    private String ruta,nombre,precio;
    private Integer Id;

    public Hotels(String ruta, String nombre, String precio, Integer id) {
        this.ruta = ruta;
        this.nombre = nombre;
        this.precio = precio;
        Id = id;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }
}

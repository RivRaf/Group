package com.example.rafael.group.Objetos;

/**
 * Created by RAFAEL on 01/03/2017.
 */

public class Featured {
    private String ruta,titulo,precio;

    public Featured(String ruta, String titulo, String precio) {
        this.ruta = ruta;
        this.titulo = titulo;
        this.precio = precio;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}

package com.example.menu;

import java.io.Serializable;


public class Usuario implements Serializable {
    String _cedula;
    String _nombre;

    public Usuario() {
    }

    public Usuario(String _cedula, String _nombre) {
        this._cedula = _cedula;
        this._nombre = _nombre;
    }

    @Override
    public String toString() {
        return "Usuario: {" +
                "Cedula= '" + _cedula + '\'' +
                ", Nombre= '" + _nombre + '\'' +
                '}';
    }

    public  String get_cedula() {
        return _cedula;
    }
    public void set_cedula(String _cedula) {
        this._cedula = _cedula;
    }
    public String get_nombre () {
        return _nombre;
    }

    public void set_nombre(String _nombre) {
        this._nombre = _nombre;
    }
}



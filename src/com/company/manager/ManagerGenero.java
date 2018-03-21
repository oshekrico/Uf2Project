package com.company.manager;

import com.company.model.Genero;


public class ManagerGenero {

    Genero[] generos = new Genero[100];

    public void crear(String estiloGenero) {
        for (int i = 0; i < generos.length; i++) {
            generos[i] = new Genero();

            generos[i].titulo = estiloGenero;
        }

    }

    public Genero consultar() {
        for (int i = 0; i < generos.length; i++) {
            return generos[i];
            ;
        }
    }
}

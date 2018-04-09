package com.company.manager;

import com.company.model.Genero;


public class ManagerGenero {

    Genero[] generos = new Genero[100];


    public void crear(String estiloGenero,String descripcionGenero) {
        Genero genero = new Genero();
        genero.titulo = estiloGenero;
        genero.descripcion = descripcionGenero;

        for (int i = 0; i < generos.length; i++) {
            if (generos[i] == null){
                generos[i] = genero;
                break;

//                generos[i] = new Genero();
//                generos[i].titulo = estiloGenero;
//                generos[i].descripcion = descripcionGenero;

            }

        }

    }

    public Genero consultar() {
        for (int i = 0; i < generos.length; i++) {
            return generos[i];
        }
        return generos[0];
    }
}

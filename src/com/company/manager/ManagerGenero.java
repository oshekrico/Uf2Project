package com.company.manager;

import com.company.model.Genero;


public class ManagerGenero {

    Genero genero;

    public void crear(String estiloGenero){
        genero = new Genero();

        genero.titulo = estiloGenero;
    }

    public Genero consultar(){
       return genero;
    }
}

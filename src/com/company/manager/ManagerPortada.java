package com.company.manager;

import com.company.model.Portada;


public class ManagerPortada {
    Portada portada;

    public  void crear(String asciiImage){
        Portada portada = new Portada();
        portada.asciiImage = asciiImage;

    }

    public Portada consultar(){
        return portada;
    }
}


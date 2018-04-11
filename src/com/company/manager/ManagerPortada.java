package com.company.manager;

import com.company.model.Portada;


public class ManagerPortada {
    // TODO: array de portadas
    Portada[] portadas = new Portada[100];


    public void crear(String asciiImage, String anime) {
        Portada portada = new Portada();
        portada.asciiImage = asciiImage;
        for (int i = 0; i < portadas.length; i++) {
            if (portadas[i] == null) {
                portadas[i] = portada;
                break;
            }
        }
    }



    public Portada[] obtener() {
        return portadas;

    }
}






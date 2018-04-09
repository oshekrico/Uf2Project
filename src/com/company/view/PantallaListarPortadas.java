package com.company.view;

import com.company.manager.ManagerPortada;
import com.company.model.Portada;

public class PantallaListarPortadas {
    public void obtener(ManagerPortada managerPortada){
        System.out.println("Lista de Portadas");
        Portada[] portadas = managerPortada.obtener();
        for (int i = 0; i < portadas.length; i++) {
            if (portadas[i] != null){
                System.out.println("Portada");
                System.out.println(portadas[i]);
            }
        }

    }
}

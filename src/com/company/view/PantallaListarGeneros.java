package com.company.view;

import com.company.manager.ManagerGenero;
import com.company.model.Genero;

public class PantallaListarGeneros {

    public void mostrar(ManagerGenero managerGenero){
        System.out.println("Lista generos: ");

        Genero genero1 = managerGenero.consultar();
        managerGenero.consultar();
        System.out.println( genero1.titulo);

    }

}

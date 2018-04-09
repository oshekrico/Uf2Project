package com.company.view;

import com.company.manager.ManagerGenero;
import com.company.model.Genero;

public class PantallaListarGeneros {

    public void mostrar(ManagerGenero managerGenero){
        System.out.println("Lista generos: ");

        Genero[] generos = managerGenero.consultar();

        System.out.println("TITULO   |   DESCRIPCION");

        for (int i = 0; i < generos.length; i++) {
            if(generos[i] != null) {
                System.out.print(generos[i].titulo);
                System.out.print("                    ");
                System.out.println(generos[i].descripcion);
            }
        }


    }

}

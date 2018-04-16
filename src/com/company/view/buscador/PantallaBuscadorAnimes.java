package com.company.view.buscador;

import com.company.manager.ManagerAnimes;
import com.company.manager.ManagerUsuarios;

import java.util.Scanner;

public class PantallaBuscadorAnimes {
    public void show(ManagerUsuarios managerUsuarios, ManagerAnimes managerAnimes){
        System.out.println("\033[104;97mAnimeApp:: Buscador Anime\033[0m");

        System.out.println("a) Por titulo");
        System.out.println("b) Por genero");
        System.out.println("c) Por estudio");
        System.out.println("d) Salir");

        Scanner scanner = new Scanner(System.in);
        String opcion = scanner.nextLine();

        switch(opcion){
            case "a":
                PantallaBuscadorTitulo pantallaBuscadorTitulo = new PantallaBuscadorTitulo();
                pantallaBuscadorTitulo.show(managerUsuarios, managerAnimes);
                break;
            case "b":
                PantallaBuscadorGenero pantallaBuscadorGenero= new PantallaBuscadorGenero();
                pantallaBuscadorGenero.show(managerUsuarios, managerAnimes);
                break;
            case "c":
                PantallaBuscadorEstudio pantallaBuscadorEstudio = new PantallaBuscadorEstudio();
                pantallaBuscadorEstudio.show(managerUsuarios, managerAnimes);
                break;
            case "d":
                break;
        }

    }
}

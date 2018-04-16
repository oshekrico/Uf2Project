package com.company.view.buscador;

import java.util.Scanner;

public class PantallaBuscadorAnimes {
    public void show(){
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
                pantallaBuscadorTitulo.show();
                break;
            case "b":
                PantallaBuscadorGenero pantallaBuscadorGenero= new PantallaBuscadorGenero();
                pantallaBuscadorGenero.show();
                break;
            case "c":
                PantallaBuscadorEstudio pantallaBuscadorEstudio = new PantallaBuscadorEstudio();
                pantallaBuscadorEstudio.show();
                break;
            case "d":
                break;
        }

    }
}

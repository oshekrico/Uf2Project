package com.company.view;

import java.util.Scanner;

public class PantallaPrincipal {
    public void iniciar(){
        System.out.println("\033[104;97AnimeApp:: Principal\033[0m");

        System.out.println("a) Buscador");
        System.out.println("b) Ultimos animes");
        System.out.println("c) Mis animes");

        Scanner scanner = new Scanner(System.in);
        String opcion = scanner.nextLine();

        switch(opcion){
            case "a":
                PantallaBuscadorAnimes pantallaBuscadorAnimes = new PantallaBuscadorAnimes();
                pantallaBuscadorAnimes.show();
                break;
            case "b":
                break;
        }

    }
}

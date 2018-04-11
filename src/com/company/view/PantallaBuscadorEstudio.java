package com.company.view;

import java.util.Scanner;

public class PantallaBuscadorEstudio {
    public void show(){
        System.out.println("\033[104;97AnimeApp:: buscador Anime :: Estudio\033[0m");

        System.out.println("Dime el estudio de tu anime: ");

        Scanner scanner = new Scanner(System.in);
        String opcion = scanner.nextLine();
        //REDIRIGIR A LA LISTA DE ANIMES

    }
}

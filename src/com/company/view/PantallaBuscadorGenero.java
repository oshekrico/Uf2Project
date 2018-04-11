package com.company.view;

import java.util.Scanner;

public class PantallaBuscadorGenero {
    public void show(){
        System.out.println("\033[104;97AnimeApp:: buscador Anime :: Genero\033[0m");

        System.out.println("Dime el genero: ");

        Scanner scanner = new Scanner(System.in);
        String opcion = scanner.nextLine();
        //REDIRIGIR A LA LISTA DE ANIMES

    }
}

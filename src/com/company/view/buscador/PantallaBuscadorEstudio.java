package com.company.view.buscador;

import com.company.manager.ManagerAnimes;
import com.company.manager.ManagerUsuarios;

import java.util.Scanner;

public class PantallaBuscadorEstudio {
    public void show(ManagerUsuarios managerUsuarios, ManagerAnimes managerAnimes){
        System.out.println("\033[104;97mAnimeApp:: Buscador Anime :: Estudio\033[0m");

        System.out.println("Dime el estudio de tu anime: ");

        Scanner scanner = new Scanner(System.in);
        String opcion = scanner.nextLine();
        //MOSTRAR A LA LISTA DE ANIMES

        System.out.println("Estudio:");
        System.out.println(opcion);
        System.out.println(" ");
        System.out.println("ID      Titulo         Genero");
        System.out.println("--      ------         ------");

        /// LOS ANIMES CON SUS ID TITULO GENERO
        System.out.println("");
        System.out.println("Escoge uno de los animes a partir de la ID: ");
        String eleccion = scanner.nextLine();

        ////DAR TODA LA INFO DEL ANIME A PARTIR DEL SCANNER
    }
}

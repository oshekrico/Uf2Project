package com.company.view.buscador;

import com.company.model.Anime;

import com.company.manager.ManagerAnimes;
import com.company.manager.ManagerUsuarios;
import com.company.model.Anime;
import com.company.view.widget.AnimeWidget;

import java.util.Scanner;

public class PantallaBuscadorGenero {
    public void show(ManagerUsuarios managerUsuarios, ManagerAnimes managerAnimes) {
        System.out.println("\033[104;97mAnimeApp:: Buscador Anime :: Genero\033[0m");

        System.out.println("Dime el genero: ");

        Scanner scanner = new Scanner(System.in);
        String genero = scanner.nextLine();

        Anime[] encontrados = managerAnimes.consultarPorGenero(genero);


        //MOSTRAR A LA LISTA DE ANIMES

        System.out.println("Genero:");
        System.out.println(genero);

        if (encontrados.length == 0) {
            System.out.println(" ");
            System.out.println("No hay ningun resultado.");
            System.out.println(" ");

            PantallaBuscadorGenero pantallaBuscadorGenero = new PantallaBuscadorGenero();
            pantallaBuscadorGenero.show(managerUsuarios, managerAnimes);
        } else {

            System.out.println(" ");
            System.out.println("ID      Titulo         Genero");
            System.out.println("--      ------         ------");

            for (int i = 0; i < encontrados.length; i++) {

                System.out.println(i + "       " + encontrados[i].titulo + "           " + encontrados[i].genero);
            }


            System.out.println("");
            System.out.println("Escoge uno de los animes a partir de la ID: ");
            int eleccion = scanner.nextInt();

            System.out.println(" ");
            System.out.println("Este es el anime que has elegido: ");
            System.out.println(" ");
            AnimeWidget animeWidget = new AnimeWidget();
            animeWidget.show(encontrados[eleccion]);
            System.out.println(" ");
            System.out.println("a) Añadir a mi lista");
            System.out.println("b) Salir");

            scanner.nextLine();

            String visto = scanner.nextLine();
            if("a".equals(visto)){
                managerAnimes.añadirAMiLista(managerUsuarios, encontrados[eleccion]);
            }

            PantallaBuscadorAnimes pantallaBuscadorAnimes = new PantallaBuscadorAnimes();
            pantallaBuscadorAnimes.show(managerUsuarios, managerAnimes);
            }

            ////DAR TODA LA INFO DEL ANIME A PARTIR DEL SCANNER

        }
}

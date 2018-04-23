package com.company.view.buscador;

import com.company.model.Anime;

import com.company.manager.ManagerAnimes;
import com.company.manager.ManagerUsuarios;
import com.company.model.Anime;

import java.util.Scanner;

public class PantallaBuscadorTitulo {
    public void show(ManagerUsuarios managerUsuarios, ManagerAnimes managerAnimes) {
        System.out.println("\033[104;97mAnimeApp:: Buscador Anime :: Titulo\033[0m");

        System.out.println("Dime el titulo de tu anime: ");

        Scanner scanner = new Scanner(System.in);
        String titulo = scanner.nextLine();

        Anime[] encontrados = managerAnimes.consultarPorTitulo(titulo);

        //MOSTRAR A LA LISTA DE ANIMES

        System.out.println("Titulo:");
        System.out.println(titulo);
        if (encontrados.length == 0) {
            System.out.println(" ");
            System.out.println("No hay ningun resultado.");
            System.out.println(" ");

            PantallaBuscadorTitulo pantallaBuscadorTitulo = new PantallaBuscadorTitulo();
            pantallaBuscadorTitulo.show(managerUsuarios, managerAnimes);
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

            System.out.println("Este es el anime que has elegido: ");
            System.out.println(" ");
            System.out.println("PORTADA");
            System.out.println("-------");
            System.out.println(encontrados[eleccion].portada);
            System.out.println(" ");
            System.out.println("TITULO");
            System.out.println("------");
            System.out.println(encontrados[eleccion].titulo);
            System.out.println(" ");
            System.out.println("GENERO");
            System.out.println("------");
            System.out.println(encontrados[eleccion].genero);
            System.out.println(" ");
            System.out.println("SINOPSIS");
            System.out.println("--------");
            System.out.println(encontrados[eleccion].sinopsis);
            System.out.println(" ");
            System.out.println("FECHA LANZAMIENTO");
            System.out.println("-----------------");
            System.out.println(encontrados[eleccion].fechaLanzamiento);
            System.out.println(" ");
            System.out.println("ESTUDIO");
            System.out.println("-------");
            System.out.println(encontrados[eleccion].estudio);
            System.out.println(" ");
            System.out.println("NUMERO CAPITULOS");
            System.out.println("----------------");
            System.out.println(encontrados[eleccion].numeroCapitulos);
            System.out.println(" ");

            System.out.println("a) Añadir a mi lista");
            System.out.println("b) Salir");

            scanner.nextLine();
            String añadir = scanner.nextLine();

            if("a".equals(añadir)){
                managerAnimes.añadirAMiLista(managerUsuarios, encontrados[eleccion]);
            }

            PantallaBuscadorAnimes pantallaBuscadorAnimes = new PantallaBuscadorAnimes();
            pantallaBuscadorAnimes.show(managerUsuarios, managerAnimes);

            ////DAR TODA LA INFO DEL ANIME A PARTIR DEL SCANNER

        }
    }
}

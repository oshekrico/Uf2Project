package com.company.view;

import com.company.manager.ManagerAnime;

import java.util.Scanner;

public class PantallaCrearAnime {

    public void crear(ManagerAnime managerAnime) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anime");

        System.out.println("Introduzca el nombre del anime");
        String nombre = scanner.nextLine();
        System.out.println("Sinopsis del anime");
        String sinop = scanner.nextLine();


        System.out.println("Anime creado");

        managerAnime.crear(nombre,sinop);

        //  PantallaListarAnime pantallaListarAnime = new PantallaListarAnime();
        //  pantallaListarAnime.mostrarLista(managerAnime);

    }
}

package com.company.view;

import com.company.manager.ManagerAnime;
import com.company.model.Anime;

import java.util.Scanner;

public class PantallaAnime {

    public void mostrar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anime");

        System.out.println("Introduzca el nombre del anime");
        String nombre = scanner.nextLine();
        System.out.println("Sinopsis");
        String sinop = scanner.nextLine();


        ManagerAnime managerAnime = new ManagerAnime();
        managerAnime.crear(nombre, sinop);


        Anime anime = managerAnime.consultar();

        System.out.println("anime");
    }
}

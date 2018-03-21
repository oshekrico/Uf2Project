package com.company.view;

import com.company.manager.ManagerAnime;
import com.company.model.Anime;

import java.util.Scanner;

public class PantallaAnime {

    public void mostrar(ManagerAnime managerAnime) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anime");

        System.out.println("Introduzca el nombre del anime");
        String nombre = scanner.nextLine();
        System.out.println("Sinopsis");
        String sinop = scanner.nextLine();




        System.out.println("Anime creado");
    }
}

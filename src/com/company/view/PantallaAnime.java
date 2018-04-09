package com.company.view;

import com.company.manager.ManagerAnime;
import com.company.model.Anime;

import java.util.Scanner;

public class PantallaAnime {

    public void mostrar(ManagerAnime managerAnime) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anime");

        System.out.println("a) Crear anime");
        System.out.println("b) Listar Anime");

        String opcion = scanner.nextLine();
        if ("a".equals(opcion)){
            PantallaCrearAnime pantallaCrearAnime = new PantallaCrearAnime();
            pantallaCrearAnime.crear(managerAnime);
        }else if ("b".equals(opcion)){
            PantallaListarAnime pantallaListarAnime = new PantallaListarAnime();
            pantallaListarAnime.show(managerAnime);
        }


    }
}

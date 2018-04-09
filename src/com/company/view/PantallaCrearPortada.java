package com.company.view;

import com.company.manager.ManagerPortada;

import java.util.Scanner;

public class PantallaCrearPortada {

    public void crear(ManagerPortada managerPortada){
        System.out.println("Crear de Portadas");

        Scanner scanner = new Scanner(System.in);

        System.out.println(" A) Id Anime:");
        String idAnime = scanner.nextLine();

        System.out.println("B) Imagen:");
        String imagen = scanner.nextLine();

        managerPortada.crear(":-)", "Akira");
    }
}

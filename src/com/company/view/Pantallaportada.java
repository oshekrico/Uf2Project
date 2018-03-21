package com.company.view;

import com.company.manager.ManagerPortada;
import com.company.model.Portada;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Pantallaportada {

    public void mostrar(ManagerPortada managerPortada){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Crear Portada");
        System.out.println("Id Anime:");
        String idAnime = scanner.nextLine();
        System.out.println("Introduzca la portada");
        String portada = scanner.nextLine();


        System.out.println("Lista de Portadas:");



    }

}

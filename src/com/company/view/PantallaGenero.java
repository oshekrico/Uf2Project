package com.company.view;

import com.company.manager.ManagerGenero;
import com.company.model.Genero;

import java.util.Scanner;

public class PantallaGenero {

    public void mostrar(){
        Scanner scanner = new Scanner (System.in);

        ManagerGenero managerGenero = new ManagerGenero();

        System.out.println("Nuevo genero:");
        String nombre = scanner.nextLine();
        managerGenero.crear(nombre);

        Genero genero1 = managerGenero.consultar();

        System.out.println("GENERO CREADO: " + genero1.titulo);


    }
}

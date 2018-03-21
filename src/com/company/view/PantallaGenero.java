package com.company.view;

import com.company.manager.ManagerGenero;
import com.company.model.Genero;

import java.util.Scanner;

public class PantallaGenero {

    public void iniciar(ManagerGenero managerGenero){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Nuevo genero:");
        String nombre = scanner.nextLine();
        managerGenero.crear(nombre);

    }
}

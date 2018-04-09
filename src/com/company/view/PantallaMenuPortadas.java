package com.company.view;

import com.company.manager.ManagerPortada;


import java.util.Scanner;

public class PantallaMenuPortadas {

    public void mostrar(ManagerPortada managerPortada){
        Scanner scanner = new Scanner(System.in);

        System.out.println("A) Crear Portada");
        System.out.println("B) Lista de Portadas:");


        String opcion = scanner.nextLine();

        if("A".equals(opcion)){
            PantallaCrearPortada pantallaCrearPortada = new PantallaCrearPortada();
            pantallaCrearPortada.crear(managerPortada);
        }
        else if("B".equals(opcion)){
            PantallaListarPortadas pantallaListarPortadas = new PantallaListarPortadas();
            pantallaListarPortadas.mostrar(managerPortada);
        }
        // mirar la opcion y abrir una pantall u otra ( pasale el manager) --> DONE





        //Portada[] portadas = managerPortada.obtener();



    }

}

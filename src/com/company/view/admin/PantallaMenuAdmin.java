package com.company.view.admin;

import com.company.manager.ManagerAnimes;
import com.company.manager.ManagerUsuarios;
import com.company.view.autenticacion.PantallaMenuAcceso;

import java.util.Scanner;

public class PantallaMenuAdmin {
    public void show(ManagerUsuarios managerUsuarios,ManagerAnimes managerAnimes){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\033[104;97mMyApp :: Menu Admin\033[0m");

        System.out.println("a) Añadir anime");
        System.out.println("b) Volver al menu de acceso");
        System.out.println("c) Salir");

        String opcion = scanner.nextLine();

        switch (opcion){
            case "a":
                PantallaCrearAnime pantallaCrearAnime = new PantallaCrearAnime();
                pantallaCrearAnime.crear(managerUsuarios,managerAnimes);
                    break;
            case "b":
                PantallaMenuAcceso pantallaMenuAcceso = new PantallaMenuAcceso();
                pantallaMenuAcceso.iniciar(managerUsuarios,managerAnimes);
                break;
            case "c":
                break;
        }
    }
}

package com.company.view;

import com.company.manager.ManagerAnimes;
import com.company.manager.ManagerUsuarios;
import com.company.view.buscador.PantallaBuscadorAnimes;
import com.company.view.misanimes.PantallaMisAnimes;
import com.company.view.ultimosanimes.PantallaUltimosAnimes;

import java.util.Scanner;

public class PantallaPrincipal {
    public void iniciar(ManagerUsuarios managerUsuarios,ManagerAnimes managerAnimes){
        while(true) {
            System.out.println("\033[104;97mAnimeApp:: Principal\033[0m");

            System.out.println("a) Buscador animes");
            System.out.println("b) Ultimos animes");
            System.out.println("c) Mis animes");
            System.out.println("d) Cerrar sesión");

            Scanner scanner = new Scanner(System.in);
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "a":
                    PantallaBuscadorAnimes pantallaBuscadorAnimes = new PantallaBuscadorAnimes();
                    pantallaBuscadorAnimes.show(managerUsuarios, managerAnimes);
                    break;
                case "b":
                    PantallaUltimosAnimes pantallaUltimosAnimes = new PantallaUltimosAnimes();
                    pantallaUltimosAnimes.show(managerUsuarios, managerAnimes);
                    break;
                case "c":
                    PantallaMisAnimes pantallaMisAnimes = new PantallaMisAnimes();
                    pantallaMisAnimes.show(managerUsuarios, managerAnimes);
                    break;
                case "d":
                    return;
            }
        }


    }
}

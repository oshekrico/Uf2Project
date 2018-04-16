package com.company.view.autenticacion;

import com.company.manager.ManagerAnimes;
import com.company.manager.ManagerUsuarios;

import java.util.Scanner;

public class PantallaMenuAcceso {

    public void iniciar(ManagerUsuarios managerUsuarios, ManagerAnimes managerAnimes){
        System.out.println("\033[104;97mMyApp :: Menu principal\033[0m");
        System.out.println("a) Registrarse");
        System.out.println("b) Acceder");
        System.out.println("c) Salir");


        Scanner scanner = new Scanner(System.in);
        String opcion = scanner.nextLine();

        if("a".equals(opcion)){
            PantallaRegistro pantallaRegistro = new PantallaRegistro();
            pantallaRegistro.iniciar(managerUsuarios, managerAnimes);
        } else if("b".equals(opcion)){
            PantallaAcceder pantallaAcceder = new PantallaAcceder();
            pantallaAcceder.iniciar(managerUsuarios,managerAnimes);
        }else if("c".equals(opcion)){
            System.out.println("  ");
            System.out.println("¡¡¡Hasta la proxima!!!");
        }
    }
}

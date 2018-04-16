package com.company.view.autenticacion;

import com.company.manager.ManagerAnimes;
import com.company.manager.ManagerUsuarios;

import java.util.Scanner;

public class PantallaRegistro {


    public void iniciar(ManagerUsuarios managerUsuarios, ManagerAnimes managerAnimes){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\033[104;97mMyApp :: Registro\033[0m");

        System.out.println("Usuario:");
        String usuario = scanner.nextLine();

        System.out.println("Password:");
        String password = scanner.nextLine();

        managerUsuarios.crearUsuario(usuario, password);

        PantallaMenuAcceso pantallaMenuAcceso = new PantallaMenuAcceso();
        pantallaMenuAcceso.iniciar(managerUsuarios, managerAnimes );
    }
}

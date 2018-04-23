package com.company.view.autenticacion;

import com.company.manager.ManagerAnimes;
import com.company.manager.ManagerUsuarios;
import com.company.view.admin.PantallaMenuAdmin;
import com.company.view.PantallaPrincipal;

import java.util.Scanner;

public class PantallaAcceder {
    public void iniciar(ManagerUsuarios managerUsuarios, ManagerAnimes managerAnimes){
        Scanner scanner = new Scanner(System.in);


            System.out.println("\033[104;97mMyApp :: Acceder\033[0m");

            System.out.println("Usuario:");
            String usuario = scanner.nextLine();

            System.out.println("Password:");
            String password = scanner.nextLine();


            String resultado = managerUsuarios.verificar(usuario, password);

            if (resultado.equals("ok")) {
                if ("admin".equals(usuario)) {
                    PantallaMenuAdmin pantallaMenuAdmin = new PantallaMenuAdmin();
                    pantallaMenuAdmin.show(managerUsuarios, managerAnimes);
                } else {
                    PantallaPrincipal pantallaPrincipal = new PantallaPrincipal();
                    pantallaPrincipal.iniciar(managerUsuarios, managerAnimes);
                }
            }
            if (resultado.equals("nok")) {
                PantallaMenuAcceso pantallaMenuAcceso = new PantallaMenuAcceso();
                pantallaMenuAcceso.iniciar(managerUsuarios, managerAnimes);
            }

    }
}

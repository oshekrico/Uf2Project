package com.company;

import com.company.manager.ManagerUsuarios;
import com.company.view.autenticacion.PantallaMenuAcceso;

public class Main {

    public static void main(String[] args) {
        ManagerUsuarios managerUsuarios = new ManagerUsuarios();

        managerUsuarios.crearUsuario("admin", "admin");
        managerUsuarios.crearUsuario("a","a");

        PantallaMenuAcceso pantallaMenuAcceso = new PantallaMenuAcceso();
        pantallaMenuAcceso.iniciar(managerUsuarios);

    }
}
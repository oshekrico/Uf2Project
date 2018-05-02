package com.company;


import com.company.manager.ManagerAnimes;
import com.company.manager.ManagerUsuarios;
import com.company.util.Utils;
import com.company.view.autenticacion.PantallaMenuAcceso;

public class Main {

    public static void main(String[] args) {
// F1(mas actual) > F2 (menos actual)
//        System.out.println("DEBERIA SER TRUE");
//        System.out.println(Utils.comparaFechas("26/10/2001", "24/10/2001"));
//        System.out.println(Utils.comparaFechas("24/11/2001", "24/10/2001"));
//        System.out.println(Utils.comparaFechas("24/10/2002", "24/10/2001"));
//
//        System.out.println("DEBERIA SER FALSE");
//        System.out.println(Utils.comparaFechas("23/10/2001", "24/10/2001"));
//        System.out.println(Utils.comparaFechas("24/9/2001", "24/10/2001"));
//        System.out.println(Utils.comparaFechas("23/10/2000", "24/10/2001"));


        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        ManagerAnimes managerAnimes = new ManagerAnimes();
        managerAnimes.crearAnimesIniciales();

        managerUsuarios.crearUsuario("admin", "admin");
        managerUsuarios.crearUsuario("a","a");

        PantallaMenuAcceso pantallaMenuAcceso = new PantallaMenuAcceso();
        pantallaMenuAcceso.iniciar(managerUsuarios, managerAnimes);

    }
}
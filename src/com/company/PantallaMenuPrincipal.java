//package com.company;
//
//import com.company.manager.ManagerUsuarios;
//import com.company.view.PantallaListarGeneros;
//
//import java.util.Scanner;
//
//public class PantallaMenuPrincipal {
//
//
//    public void iniciar(ManagerUsuarios managerUsuarios){
//        System.out.println("\033[104;97mMyApp :: Menu principal\033[0m");
//        System.out.println("a) Crear Genero");
//        System.out.println("b) Listar generos");
//
//        Scanner scanner = new Scanner(System.in);
//        String opcion = scanner.nextLine();
//
//        if("a".equals(opcion)){
//            PantallaGenero pantallaRegistro = new PantallaGenero();
//            pantallaRegistro.iniciar(managerGenero);
//        } else if("b".equals(opcion)){
//            PantallaListarGeneros pantallaListarGeneros = new PantallaListarGeneros();
//            pantallaListarGeneros.mostrar(managerGenero);
//        }
//    }
//}

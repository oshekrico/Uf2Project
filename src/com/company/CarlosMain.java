package com.company;

import com.company.manager.ManagerGenero;
import com.company.model.Genero;
import com.company.view.PantallaGenero;
import com.company.view.PantallaListarGeneros;
import com.company.view.PantallaMenuPrincipal;

public class CarlosMain {

    public static void main(String[] args) {
        ManagerGenero managerGenero = new ManagerGenero();

        PantallaMenuPrincipal pantallaMenuPrincipal = new PantallaMenuPrincipal();
        pantallaMenuPrincipal.iniciar(managerGenero);

//        PantallaGenero pantallaGenero = new PantallaGenero();
//        pantallaGenero.iniciar(managerGenero);
//
//        PantallaListarGeneros pantallaListarGeneros = new PantallaListarGeneros();
//        pantallaListarGeneros.mostrar(managerGenero);

    }

}


//    Genero g1 = new Genero();
//        g1.setTitulo("Shonen");
//                g1.setDescripcion("dasdasdas");
//
//                Genero g2 = new Genero();
//                g2.setTitulo("Fantasia");
//                g2.setDescripcion("dasdasdas");
//
//                Genero g3 = new Genero();
//                g3.setTitulo("Deporte");
//                g3.setDescripcion("dasdasdas");
//
//                Genero g4 = new Genero();
//                g4.setTitulo("Infantil");
//                g4.setDescripcion("dasdasdas");
//
//                Genero g5 = new Genero();
//                g5.setTitulo("Magia");
//                g5.setDescripcion("dasdasdas");



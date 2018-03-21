package com.company;

import com.company.manager.ManagerAnime;
import com.company.model.Anime;
import com.company.view.PantallaAnime;
import com.company.view.PantallaListarAnime;

public class NayanMain {
    public static void main(String[] args) {

        ManagerAnime managerAnime = new ManagerAnime();

        PantallaAnime pantallaAnime = new PantallaAnime();

        pantallaAnime.mostrar(managerAnime);

        pantallaAnime.mostrar(managerAnime);

//        PantallaListarAnime pantallaListarAnime = new PantallaListarAnime();
//        pantallaListarAnime.mostrarLista(managerAnime);
//



    }

}





//
//    Anime a1 = new Anime();
//    //  a1.nombreAnime = "Fairy tail";
//    //   a1.sinopsis = "Anime magia";
//    //  a1.numeroDeCapitulos = 277;
//    //   a1.fechaDeLanzamiento = "12 de  octubre de 2009";
//
//
//    Anime a2 = new Anime();
//    //   a2.nombreAnime = "Slam Dunk";
//    //  a2.sinopsis = "Anime Deporte";
//    //  a2.numeroDeCapitulos = 101;
//    //  a2.fechaDeLanzamiento = 16 de octubre de 1993;
//
//
//    Anime a3 = new Anime();
//    //   a3.nombreAnime = "One piece";
//    //   a3.sinopsis = "Anime Aventura";
//    //   a3.numeroDeCapitulos = 827;
//    //    a3.fechaDeLanzamiento = 20 de octubre de 1999;
//
//    Anime a4 = new Anime();
//    //   a3.nombreAnime = "Bleach";
//    //   a3.sinopsis = "Anime Shonen";
//    //   a3.numeroDeCapitulos = 800;
//    //    a3.fechaDeLanzamiento = 5 de octubre de 2004;
//
//    Anime a5 = new Anime();
////   a3.nombreAnime = "Pingu";
////   a3.sinopsis = "Anime Comedia";
////   a3.numeroDeCapitulos = 157;
////    a3.fechaDeLanzamiento = 7 de marzo de 1990;
//
//        a1.asignarNombreAnime("Fairy tail");
//                a1.asignarsinopsis("Anime Aventura");
////        a1.asignarfechaDeLanzamiento();
//                //    a1.asignarnumeroDeCapitulos();
//
//                a2.asignarNombreAnime("Slam Dunk");
//                a3.asignarNombreAnime("One piece");
//                a4.asignarNombreAnime("Bleach");
//                a5.asignarNombreAnime("Pingu");
//

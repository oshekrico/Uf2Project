package com.company;

import com.company.model.Anime;

public class NayanMain {
    public static void main(String[] args) {
        Anime a1 = new Anime();
        a1.nombreAnime = "Fairy tail";
        a1.sinopsis = "Anime magia";
        a1.numeroDeCapitulos = 277;
        a1.fechaDeLanzamiento = 2009;


        Anime a2 = new Anime();
        a2.nombreAnime = "Naruto";
        a2.sinopsis = "Anime Lucha";
        a2.numeroDeCapitulos = 386;
        a2.fechaDeLanzamiento = 2002;


        Anime a3 = new Anime();
        a3.nombreAnime = "One piece";
        a3.sinopsis = "Anime Aventura";
        a3.numeroDeCapitulos = 800;
        a3.fechaDeLanzamiento = 1997;
    }

}

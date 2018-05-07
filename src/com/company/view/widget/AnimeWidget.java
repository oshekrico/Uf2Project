package com.company.view.widget;

import com.company.ascii.ASCII;
import com.company.model.Anime;

public class AnimeWidget {
    public void show(Anime anime){
        System.out.println(" ");
        System.out.println("PORTADA");
        System.out.println("-------");
        String asciiImage = ASCII.image(anime.portada);
        System.out.println(asciiImage);
        System.out.println(" ");
        System.out.println("TITULO");
        System.out.println("------");
        System.out.println(anime.titulo);
        System.out.println(" ");
        System.out.println("GENERO");
        System.out.println("------");
        System.out.println(anime.genero);
        System.out.println(" ");
        System.out.println("SINOPSIS");
        System.out.println("--------");
        System.out.println(anime.sinopsis);
        System.out.println(" ");
        System.out.println("FECHA LANZAMIENTO");
        System.out.println("-----------------");
        System.out.println(anime.fechaLanzamiento);
        System.out.println(" ");
        System.out.println("ESTUDIO");
        System.out.println("-------");
        System.out.println(anime.estudio);
        System.out.println(" ");
        System.out.println("NUMERO CAPITULOS");
        System.out.println("----------------");
        System.out.println(anime.numeroCapitulos);
    }
}

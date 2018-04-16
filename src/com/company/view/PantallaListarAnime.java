package com.company.view;

import com.company.manager.ManagerAnime;
import com.company.model.Anime;

import java.util.Scanner;

public class PantallaListarAnime {

    void show(ManagerAnime managerAnime){
        System.out.println("LISTA DE ANIMES");
        mostrarLista(managerAnime);
    }

    public void mostrarLista(ManagerAnime managerAnime) {
        Anime[] animes = managerAnime.consultar();
        for (int i = 0; i <animes.length ; i++) {
            if (animes[i] != null) {
                System.out.println(animes[i].nombreAnime);
                System.out.println("         ");
                System.out.println(animes[i].sinopsis);
            }
        }
        System.out.println("Animes" + managerAnime.contarAnimes());
        PantallaMenuAnime pantallaMenuAnime = new PantallaMenuAnime();
        pantallaMenuAnime.mostrar(managerAnime);
    }


}

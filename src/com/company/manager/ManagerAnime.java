package com.company.manager;

import com.company.model.Anime;

public class ManagerAnime {
    Anime[] animes = new Anime[100];

    public void crear (String nombre, String sinop ) {
        for (int i = 0; i < animes.length ; i++) {
            if (animes[i] == null) {
                animes[i] = new Anime();
                animes[i].nombreAnime = nombre;
                animes[i].sinopsis = sinop;
                break;
            }
        }
    }

    public Anime[] obtenerAnimes(){
        return animes;
    }
}


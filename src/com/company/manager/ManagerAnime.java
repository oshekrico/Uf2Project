package com.company.manager;

import com.company.model.Anime;

public class ManagerAnime {
    Anime[] anime = new Anime[100];
    public void crear (String nombre, String sinop ) {
        for (int i = 0; i < anime.length ; i++) {
            if (anime[i] == null) {

                anime[i] = new Anime();
                anime[i].nombreAnime = nombre;
                anime[i].sinopsis = sinop;
            }
        }
    }
    public void consultar(){

    }
}

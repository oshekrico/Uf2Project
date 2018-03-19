package com.company.manager;

import com.company.model.Anime;

public class ManagerAnime {
    Anime anime;
    public void crear (String nombre, String sinop ) {
     Anime anime = new Anime();

     anime.nombreAnime = nombre;
     anime.sinopsis = sinop;

    }
  public Anime consultar(){
    return anime;
    }
}

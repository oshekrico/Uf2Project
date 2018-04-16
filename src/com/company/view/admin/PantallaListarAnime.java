package com.company.view.admin;

import com.company.manager.ManagerAnimes;
import com.company.model.Anime;

public class PantallaListarAnime {

    void show(ManagerAnimes managerAnimes){
        System.out.println("LISTA DE ANIMES");
        mostrarLista(managerAnimes);
    }

    public void mostrarLista(ManagerAnimes managerAnimes) {
        Anime[] animes = managerAnimes.consultar();

        for (int i = 0; i <animes.length ; i++) {
            if (animes[i] != null) {
                System.out.println(animes[i].titulo);
                System.out.println("         ");
                System.out.println(animes[i].sinopsis);
            }
        }
        System.out.println("Animes" + animes.length);
    }


}

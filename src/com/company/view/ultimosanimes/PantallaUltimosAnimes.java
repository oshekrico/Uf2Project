package com.company.view.ultimosanimes;

import com.company.manager.ManagerAnimes;
import com.company.manager.ManagerUsuarios;
import com.company.model.Anime;

public class PantallaUltimosAnimes {
    public void show(ManagerUsuarios managerUsuarios, ManagerAnimes managerAnimes) {
        System.out.println("\033[104;97mAnimeApp:: UltimosAnime\033[0m");
        System.out.println("Estos son Los ultimos animes.");
        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("");

        Anime[] ultimosAnime = managerAnimes.consultarUltimosAnime();
        for (int i = 0; i < ; i++) {

        }
        for (int i = 0; i < ultimosAnime.length; i++) {
            System.out.println(ultimosAnime[i].titulo+" "+ultimosAnime[i].fechaLanzamiento);

        }


    }
}

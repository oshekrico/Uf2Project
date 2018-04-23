package com.company.view.misanimes;

import com.company.manager.ManagerAnimes;
import com.company.manager.ManagerUsuarios;

public class PantallaMisAnimes {
    public void show(ManagerUsuarios managerUsuarios, ManagerAnimes managerAnimes){
        System.out.println("\033[104;97mAnimeApp:: MisAnimes\033[0m");
        System.out.println(" ");
        System.out.println("Estos son MisAnimes: ");
        System.out.println(" ");

        for (int i = 0; i < managerUsuarios.logeado.misAnimes.length; i++) {
            if(managerUsuarios.logeado.misAnimes[i] != null) {
                System.out.println(managerUsuarios.logeado.misAnimes[i].titulo);
            }
        }
        System.out.println(" ");

    }
}

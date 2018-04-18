package com.company.view.admin;

        import com.company.manager.ManagerAnimes;
        import com.company.manager.ManagerUsuarios;

        import java.util.Scanner;

public class PantallaCrearAnime {

    public void crear(ManagerUsuarios managerUsuarios, ManagerAnimes managerAnimes){
        System.out.println("\033[104;97mMyApp :: Menu Admin :: Crear Anime\033[0m");


        Scanner scanner = new Scanner(System.in);

        System.out.println("Titulo del Anime: ");
        String titulo = scanner.nextLine();

        System.out.println("Portada");
        String portada = scanner.nextLine();

        System.out.println("Genero:");
        String genero = scanner.nextLine();

        System.out.println("Sinopsis::");
        String sinopsis = scanner.nextLine();

        System.out.println("Fecha de Lanzamiento: ");
        String fechaLanzamiento = scanner.nextLine();

        System.out.println("Numero de Capitulos:");
        int numeroCapitulos = scanner.nextInt();

        String basura = scanner.nextLine();

        System.out.println("Estudio: ");
        String estudio = scanner.nextLine();


        managerAnimes.crearAnime(titulo, portada,genero, sinopsis, fechaLanzamiento, numeroCapitulos, estudio);

        PantallaMenuAdmin pantallaMenuAdmin = new PantallaMenuAdmin();
        pantallaMenuAdmin.show(managerUsuarios,managerAnimes);
    }
}

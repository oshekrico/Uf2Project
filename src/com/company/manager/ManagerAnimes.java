package com.company.manager;

import com.company.model.Anime;

public class ManagerAnimes {
    Anime[] animes = new Anime[40];

    public void crearAnime(String titulo, String genero, String sinopsis, String fechaLanzamiento, int numeroCapitulos, String estudio, String portada){

        Anime anime = new Anime();
        anime.titulo = titulo;
        anime.genero = genero;
        anime.sinopsis = sinopsis;
        anime.fechaLanzamiento = fechaLanzamiento;
        anime.numeroCapitulos = numeroCapitulos;
        anime.estudio = estudio;
        anime.portada =portada;

        for (int i = 0; i < animes.length; i++) {
            if(animes[i] == null){
                animes[i] = anime;
                break;
            }
        }
    }

    public Anime[] consultar(){
        // retornar solo los que no sean NULL
        return animes;
    }

    public Anime[] consultarPorTitulo(String titulo){
        int cuenta = 0;
        if (animes != null){
            for (int i = 0; i <animes.length ; i++) {
                if (animes[i] != null){
                    if(animes[i].titulo.contains(titulo)) {
                        cuenta++;
                    }

                }

            }
        }
        Anime[] animesEncontrados = new Anime[cuenta];
        if (animes != null){
            for (int i = 0,j = 0; i <animes.length ; i++) {
                if (animes[i] != null) {
                    if (animes[i].titulo.contains(titulo)) {
                        animesEncontrados[j] = animes[i];
                        j++;
                    }
                }
            }
        }

        return animesEncontrados;
    }

    public Anime[] consultarPorGenero(String genero){
        int cuenta = 0;
        if (animes != null){
            for (int i = 0; i <animes.length ; i++) {
                if (animes[i] != null){
                    if(animes[i].genero.contains(genero)) {
                        cuenta++;
                    }

                }

            }
        }
        Anime[] animesEncontrados = new Anime[cuenta];
        if (animes != null){
            for (int i = 0,j = 0; i <animes.length ; i++) {
                if (animes[i] != null) {
                    if (animes[i].genero.contains(genero)) {
                        animesEncontrados[j] = animes[i];
                        j++;
                    }
                }
            }
        }

        return animesEncontrados;
    }

    public Anime[] consultarPorEstudio(String estudio){
        int cuenta = 0;
        if (animes != null){
            for (int i = 0; i <animes.length ; i++) {
                if (animes[i] != null){
                    if(animes[i].estudio.contains(estudio)) {
                        cuenta++;
                    }

                }

            }
        }
        Anime[] animesEncontrados = new Anime[cuenta];
        if (animes != null){
            for (int i = 0,j = 0; i <animes.length ; i++) {
                if (animes[i] != null) {
                    if (animes[i].estudio.contains(estudio)) {
                        animesEncontrados[j] = animes[i];
                        j++;
                    }
                }
            }
        }

        return animesEncontrados;
    }


    public void crearAnimesIniciales(){
        crearAnime("HOLA", " ANIME", "tuyjf", "fd/ds7/8", 1, "ADIOS","dasdas");
        crearAnime("HOLA2", "ANIME", "tuyjf", "fd/ds7/8", 1, "ADIOS","das");
        crearAnime("HOLA3", "ANIME", "tuyjf", "fd/ds7/8", 1, "ADIOS","sda");
        crearAnime("HOLA4", "ANIME", "tuyjf", "fd/ds7/8", 1, "ADIOS", "adas");
        crearAnime("HOLA5", "ANIME", "tuyjf", "fd/ds7/8", 1, "ADIOS", "sda");
        crearAnime("HOLA6", "ANIME", "tuyjf", "fd/ds7/8", 1, "ADIOS", "das");
    }
}

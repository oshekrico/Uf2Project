package com.company.manager;

import com.company.model.Anime;

public class ManagerAnimes {
    Anime[] animes = new Anime[40];

    public void crearAnime(String titulo, String portada, String genero, String sinopsis, String fechaLanzamiento, int numeroCapitulos, String estudio){

        Anime anime = new Anime();
        anime.titulo = titulo;
        anime.portada = portada;
        anime.genero = genero;
        anime.sinopsis = sinopsis;
        anime.fechaLanzamiento = fechaLanzamiento;
        anime.numeroCapitulos = numeroCapitulos;
        anime.estudio = estudio;

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
                    if(animes[i].titulo.equals(titulo)) {
                        cuenta++;
                    }
                }

            }
        }
        Anime[] animesEncontrados = new Anime[cuenta];
        if (animes != null){
            for (int i = 0,j = 0; i <animes.length ; i++) {
                if (animes[i] != null){
                    if(animes[i].titulo.equals(titulo)) {
                        animesEncontrados[j] = animes[i];
                        j++;
                    }
                }

            }
        }

        return animesEncontrados;
    }


    public void crearAnimesIniciales(){
        crearAnime("HOLA", "ANIME", "tuyjf", "fd/ds7/8", 1, "ADIOS");
        crearAnime("HOLA2", "ANIME2", "tuyjf", "fd/ds7/8", 1, "ADIOS");
        crearAnime("HOLA3", "ANIME", "tuyjf", "fd/ds7/8", 1, "ADIOS");
        crearAnime("HOLA4", "ANIME", "tuyjf", "fd/ds7/8", 1, "ADIOS");
        crearAnime("HOLA5", "ANIME", "tuyjf", "fd/ds7/8", 1, "ADIOS");
        crearAnime("HOLA6", "ANIME", "tuyjf", "fd/ds7/8", 1, "ADIOS");
    }
}

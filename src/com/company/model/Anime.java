package com.company.model;

public class Anime {
    //campo

    public String nombreAnime;
    public  String sinopsis;
    public String fechaDeLanzamiento;
    public int numeroDeCapitulos;

    //metodos

    public void asignarNombreAnime ( String nombre) {
          nombreAnime= nombre;
    }

    public void asignarsinopsis ( String sinopsisanime) {
        sinopsis= sinopsisanime;
    }

    public void asignarfechaDeLanzamiento ( String fechaDeLanzamientoAnime) {
        fechaDeLanzamiento= fechaDeLanzamientoAnime;
    }

    public void asignarnumeroDeCapitulos ( int numeroDeCapitulosAnime) {
        numeroDeCapitulos= numeroDeCapitulosAnime;
    }

}

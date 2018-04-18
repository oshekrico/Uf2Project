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


    public void crearAnimesIniciales() {
        crearAnime("Fairy Tail", "^.^", "fantasía", "Un día, Lucy Heartfilia, una joven de 17 años de edad especializada en la magia de espíritus celestiales, huye" +
                " de su hogar y viaja al reino de Fiore para cumplir su sueño de unirse al gremio de Fairy Tail. En el camino conoce a Natsu Dragneel, un joven que busca a Igneel (un dragón que" +
                " lo crio como un padre adoptivo en su infancia), y que viaja acompañado de su mejor amigo, un gato parlante llamado Happy", "12/10/2009", 277, "Pictures");

        crearAnime("One Piece", ":D", "aventura", "La serie comienza con la ejecución de Gol D. Roger, un hombre conocido como el Rey de los Piratas. Poco \" +\n" +
                "\"antes de su muerte, Roger hace mención a su gran tesoro legendario, el «One Piece» , y a que puede ser tomado por todo aquél que lo desee. Esto marca el inicio de una" +
                " era conocida como la Gran Era Pirata. Como resultado, un sinnúmero de piratas zarparon hacia Grand Line con el objetivo de encontrarlo", "20/10/1999", 832, "Toei Animation");

        crearAnime("Naruto",":)"," Acción","Naruto Uzumaki es un ninja adolescente que tiene encerrado en su interior al «Zorro de Nueve Colas»  Doce años" +
                " antes del inicio de la serie, este demonio atacó a la Aldea Oculta de la Hoja matando a muchas personas. Como consecuencia, el líder de la aldea (el Cuarto Hokage," +
                " Minato Namikaze) sacrificó su vida utilizando el Shiki Fūjin para sellarlo dentro de Naruto cuando era un recién nacido, con lo que esperaba detener la masacre. Por ello," +
                " Naruto fue víctima de maltratos por quienes lo consideraban como el propio Kyūbi","15/02/2007",500," Pierrot");

        crearAnime("Dragon Ball","-_-"," Acción","Freezer es un ser que conquista planetas para venderlos después a través de una organizaciónNota a la que pertenecen" +
                " criaturas de distintas razas. Una de ellas es la de los saiyajin, seres con aspecto humano y poseedores de mucha fuerza. Temeroso de que representen una amenaza para su dominio, Freezer" +
                " decide usar sus poderes para exterminarlos destruyendo su hogar, el planeta Vegeta.Solo unos cuantos saiyajin sobreviven a la masacre, entre ellos Vegeta, Nappa y los hermanos Raditz y Kakarotto," +
                " a quienes prefiere dejar con vida para que sigan sirviendo a su propósito","",159,"Toei Animation");

        crearAnime("Bleach","._.","aventura","La serie narra las aventuras de Ichigo Kurosaki, un adolescente que tiene la facultad de interactuar con los espíritus. Una noche, Ichigo se " +
                "encuentra con una shinigami —personificación japonesa del Dios de la muerte— llamada Rukia Kuchiki, quien se sorprende que pueda verla. Sin embargo, su conversación es interrumpida por la aparición de un" +
                " hollow, un espíritu maligno. Después de que Rukia fuera gravemente herida al tratar de proteger a Ichigo, esta intenta traspasarle parte de sus poderes a Ichigo para que pueda enfrentarse al hollow en igualdad " +
                "de condiciones","05/10/2004",366,"Pierrot");

        crearAnime("Shingeki no Kyojin","q.q","fantasía","Hace más de 100 años, la humanidad es casi aniquilada por unas siniestras criaturas desde unos 3 hasta 15 metros de altura,conocidas como los " +
                "Titanes, que surgen de la nada con un único propósito: devorar seres humanos. No obstante, un grupo reducido de personas pudo sobrevivir dentro de una enorme área de terreno amurallada, protegida por muros de 50 metros" +
                " de altura, el triple de los titanes más altos registrados hasta la fecha de su construcción","",,"");

        crearAnime("","","","","06/04/2013",30,"Wit Studio");


    }
}

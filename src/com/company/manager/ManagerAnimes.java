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
                    if(animes[i].titulo.contains(titulo)) {
                        cuenta++;
                    }
                }

            }
        }
        Anime[] animesEncontrados = new Anime[cuenta];
        if (animes != null){
            for (int i = 0,j = 0; i <animes.length ; i++) {
                if (animes[i] != null){
                    if(animes[i].titulo.contains(titulo)) {
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
                if (animes[i] != null){
                    if(animes[i].genero.contains(genero)) {
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
                    if(animes[i].estudio.toLowerCase().contains(estudio.toLowerCase())) {
                        cuenta++;
                    }
                }

            }
        }
        Anime[] animesEncontrados = new Anime[cuenta];
        if (animes != null){
            for (int i = 0,j = 0; i <animes.length ; i++) {
                if (animes[i] != null){
                    if(animes[i].estudio.toLowerCase().contains(estudio.toLowerCase())) {
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

        crearAnime("Shingeki no Kyojin","q.q","fantasía","Hace más de 100 años, la humanidad es casi aniquilada por unas siniestras criaturas desde unos 3 hasta 15 metros de altura,conocidas como los " +
                "Titanes, que surgen de la nada con un único propósito: devorar seres humanos. No obstante, un grupo reducido de personas pudo sobrevivir dentro de una enorme área de terreno amurallada, protegida por muros de 50 metros" +
                " de altura, el triple de los titanes más altos registrados hasta la fecha de su construcción","06/04/2013",30,"Wit Studio");


        crearAnime("Bleach","._.","aventura","La serie narra las aventuras de Ichigo Kurosaki, un adolescente que tiene la facultad de interactuar con los espíritus. Una noche, Ichigo se " +
                "encuentra con una shinigami —personificación japonesa del Dios de la muerte— llamada Rukia Kuchiki, quien se sorprende que pueda verla. Sin embargo, su conversación es interrumpida por la aparición de un" +
                " hollow, un espíritu maligno. Después de que Rukia fuera gravemente herida al tratar de proteger a Ichigo, esta intenta traspasarle parte de sus poderes a Ichigo para que pueda enfrentarse al hollow en igualdad " +
                "de condiciones","05/10/2004",366,"Pierrot");

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

        crearAnime("Toradora","*_*","romance","La historia de Toradora! empieza con el protagonista masculino, Ryūji Takasu, quien está frustrado por tratar de verse bien al entrar a " +
                "segundo año de preparatoria. A pesar de su personalidad gentil, sus ojos los hacen parecer un delincuente intimidante, de manera que se siente sin posibilidades de encajar, especialmente entre sus " +
                "compañeros.","26/03/2009",25,"J.C.Staff");

        crearAnime("D-Frag","@_@","Comedia","Kenji Kazama es un joven delincuente con muy mala fama que, un día se cruza con el llamado “Club de creación de juegos” que preside una chica " +
                "llamada Ruka Shibasaki (atributo fuego/oscuridad) y al que también asisten la presidenta del consejo estudiantil Chitose Karasuyama (atributo tierra), Sakura Mizukami de primer año (atributo agua) y cuya " +
                "consejera es la profesora de segundo Minami Osawa (atributo rayo), que acaban “forzándolo” a unirse al club. Ahora Kazama está rodeado de un grupo de gente de lo más rara.","24/03/2014",
                24,"Brain's Base");

        crearAnime("Tengen Toppa Gurren-Lagann","YwY","Mecha","Gurren Lagann tiene lugar en un futuro donde la Tierra está dominada por el Rey Espiral, Lordgenome, que obliga a la humanidad a vivir" +
                " en aldeas subterráneas aisladas. Estos pueblos no tienen contacto con el mundo de la superficie u otros pueblos, estando bajo la constante amenaza de terremotos. Los cavadores son aldeanos reclutados para expandir" +
                " las casas subterráneas cada vez a mayor profundidad","29/04/2007",27,"Gainax");

        crearAnime("Code Geass","uwu","Mecha","El Sacro Imperio de Britannia declaró la guerra a Japon. Sobrepasó a las fuerzas japonesas y conquistó el país en menos de un mes, haciendo uso de sus nuevas armas" +
                " robóticas, los Knightmare Frames. Japón perdió su libertad y derechos, y la ahora colonia pasó a ser llamado \"Área 11\". Sus habitantes, ahora llamados \"Elevens\" (En español: Onces), fueron obligados a sobrevivir en" +
                " guetos.","28/07/2007",25,"Sunrise");

        crearAnime("Detective Conan",":v","misterio","El detective juvenil más famoso de Japón, el estudiante de secundaria, él es Shinichi Kudo, se encuentra en un parque de atracciones junto a su amiga de la " +
                "infancia Ran Mouri, de la que está secretamente enamorado pero él no sabe que ella también lo está de él. Allí, después de resolver un nuevo caso de muerte, se separa de su amiga y presencia un intercambio sospechoso de dinero" +
                " entre uno de los hombres vestidos de negro que estaba presente en el caso anterior y un hombre misterioso. Mientras los espiaba, Shinichi es atacado por la espalda por el compañero del hombre de negro, y le administran un veneno " +
                "el APTX 4869 con el fin de matarlo. Sin embargo el veneno tuvo un efecto inesperado: el cuerpo de Shinichi pasó a convertirse en el de un niño de 7 años.","08/01/1996",900,"TMS Entertainment");

        crearAnime("Sword Art Online","$:","romance","Escapar es imposible hasta terminar el juego; un game over significaría una verdadera \"muerte\". Sin saber la \"verdad\" de la siguiente generación del Multijugador " +
                "Masivo Online, 'Sword Art Online(SAO)', con 10 mil usuarios unidos juntos abriendo las cortinas para esta cruel batalla a muerte. Participando solo en SAO, el protagonista Kirito ha aceptado inmediatamente la \"verdad\" de este MMO." +
                " Y, en el mundo del juego, un gigante castillo flotante llamado 'Aincrad', Kirito se distinguió a si mismo como un jugador solitario. Apuntando a terminar el juego al alcanzar la planta mas alta el solo continua avanzando arriesgadamente " +
                "hasta que recibe una invitación a la fuerza de una guerrera y esgrimista experta, Asuna, con la cual tendra que hacer equipo.","07/07/2012",25,"A-1 Pictures");

        crearAnime("Death Note","=_=","misterio","La historia es protagonizada por Light Yagami, un estudiante sobresaliente de Japón que tiene una perspectiva «aburrida» de la vida y quien considera el mundo como un lugar «podrido»." +
                " Un día, su vida sufre un cambio radical, cuando encuentra un extraño cuaderno sobrenatural llamado «Death Note», tendido en el suelo. Detrás de la portada de dicho cuaderno había instrucciones sobre su uso, donde decía que si se escribía el nombre de " +
                "una persona y se visualizaba mentalmente el rostro de ésta, moriría de un ataque al corazón. Al principio, Light desconfiaba de la autenticidad del cuaderno, pero luego de probarlo en dos ocasiones, se da cuenta que su poder era " +
                "real","26/06/2007",37,"Madhouse");

        crearAnime("Zero no Tsukaima","XD","Comedia","En un mundo donde existe la magia y existe cierta desigualdad social entre la gente que puede realizar magia y la que no, Louise Françoise Le Blanc de La Vallière, también llamada por sus" +
                " compañeros en la academia de magia Louise la Cero (ゼロのルイズ Zero no Ruizu?), debido a que ella no es capaz de realizar algún hechizo sin que haya una explosión. En la academia existe un ritual mediante el cual todos ",
                "24/09/2007",12,"J.C.Staff");

        crearAnime("Yū Yū Hakusho","r.r","Acción",". La historia se centra en Yusuke Urameshi, un chico rebelde que muere salvando a un niño de morir en un accidente de automóvil. Al ir al mundo de los muertos, concluyen que su hora de morir no " +
                "había llegado aún, por lo que no puede entrar al cielo ni al infierno y en consecuencia debe permanecer en la Tierra con la condición de que ayude a resolver diversos casos asociados a menudo con fenómenos paranormales o entidades demoniacas.",
                "17/01/1992",112," Pierrot");

        crearAnime("High School DxD","7u7","ecchi","Issei Hyōdō es un estudiante de segundo año de la Academia Kuō que tiene una gran perversión y una conducta muy lasciva. Lleva una vida tranquila hasta que es llamado para una cita con una chica " +
                "llamada Yūma Amano. Cuando comienza a oscurecer, la chica lo lleva hasta un lugar apartado donde le muestra su verdadera forma. Ella es un ángel caído y planea asesinarlo. Ya que nadie puede salvarlo, Issei muere.","23/03/2012",18,"TNK");

        crearAnime("Shijō Saikyō no Deshi Ken'ichi",":3","ecchi","Ken'ichi Shirahama es un muchacho débil y tímido que se une al club de karate de su escuela en busca de hacerse más fuerte. Sin embargo, los demás miembros solo se dedican a maltratarle por diversión " +
                "y sin molestarse en entrenarlo. Un día, conoce a una hermosa joven recién trasferida a su clase llamada Miu, quien posee un asombroso poder como luchadora, y tras conocerse se transforma en el primer amigo de la joven","07/10/2006",50,"TMS Entertainment");


    }
}

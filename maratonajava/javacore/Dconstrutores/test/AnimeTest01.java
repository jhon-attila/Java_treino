package teste.curso.maratonajava.javacore.Dconstrutores.test;


import teste.curso.maratonajava.javacore.Dconstrutores.Domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args){
        Anime anime = new Anime("haikyuu",  "Luta", 12, "ação", "Produtor");

        anime.imprime();
    }

}

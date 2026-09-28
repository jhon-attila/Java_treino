package teste.curso.maratonajava.javacore.Csobrecargametodos.test;


import teste.curso.maratonajava.javacore.Csobrecargametodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args){
        Anime anime = new Anime();
        anime.init("Dragon ball", "Luta", 12);
        anime.init("Dragon ball", "Luta", 12, "ação");
        anime.imprime();
    }

}

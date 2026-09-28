package teste.curso.maratonajava.javacore.Eblocosinicializacao.test;

import teste.curso.maratonajava.javacore.Eblocosinicializacao.Domain.Anime;

public class AnimeTes01 {
    public static void main(String[] args) {
    Anime anime = new Anime("O");
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio+" ");
        }


    }
}

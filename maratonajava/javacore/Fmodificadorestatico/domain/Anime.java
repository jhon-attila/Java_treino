package teste.curso.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0  O Bloco de inicialização é executado quando a JVM carregar a classe
    // 1º Se aloca um espaço em memoria
    // 2º Cada atributo de classe é  criado e inicializado com valores default ou o que for passado
    // 3º Bloco de inicialização é executado
    // 4º Construtor é executado
    static {
        System.out.println("Dentro do bloco");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodios : Anime.episodios) {
            System.out.print(episodios + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}

package teste.curso.maratonajava.javacore.Gassociacao.test;

import teste.curso.maratonajava.javacore.Gassociacao.domain.Jogador;
import teste.curso.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest03 {
    static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("pelé");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("----Jogador----");
        jogador.imprime();

        System.out.println("----Time----");
        time.imprime();
    }
}

package teste.curso.maratonajava.javacore.Gassociacao.test;

import teste.curso.maratonajava.javacore.Gassociacao.domain.Jogador;
import teste.curso.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest02 {
    static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Time time = new Time("Seleção Brasileira");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}

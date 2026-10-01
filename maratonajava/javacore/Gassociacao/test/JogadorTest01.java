package teste.curso.maratonajava.javacore.Gassociacao.test;

import teste.curso.maratonajava.javacore.Gassociacao.domain.Jogador;

public class JogadorTest01 {
    static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romario");
        Jogador jogador3 = new Jogador("Outro");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for(Jogador jogador: jogadores){
            jogador.imprime();
        }
    }
}

package teste.curso.maratonajava.javacore.Gassociacao.test;

import teste.curso.maratonajava.javacore.Gassociacao.domain.Escola;
import teste.curso.maratonajava.javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("João");
        Professor[] professores = {professor};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}

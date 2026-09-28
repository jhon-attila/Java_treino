package teste.curso.maratonajava.javacore.Bintroducaometodos.test;

import teste.curso.maratonajava.javacore.Bintroducaometodos.domain.Estudante;
import teste.curso.maratonajava.javacore.Bintroducaometodos.domain.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "carlos";
        estudante01.sexo = 'm';
        estudante01.idade = 156;

        estudante02.nome = "maria";
        estudante02.sexo = 'F';
        estudante02.idade = 16;

        impressora.imprime(estudante02);

        impressora.imprime(estudante01);

        System.out.println("--------------------------------");

        impressora.imprime(estudante02);

        impressora.imprime(estudante01);
    }
}

package teste.curso.maratonajava.javacore.Bintroducaometodos.test;

import teste.curso.maratonajava.javacore.Bintroducaometodos.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args){
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "carlos";
        estudante01.sexo = 'm';
        estudante01.idade = 156;

        estudante02.nome = "maria";
        estudante02.sexo = 'F';
        estudante02.idade = 16;

        estudante01.imprime();
        estudante02.imprime();
    }
}

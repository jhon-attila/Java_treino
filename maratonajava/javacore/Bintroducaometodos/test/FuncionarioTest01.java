package teste.curso.maratonajava.javacore.Bintroducaometodos.test;

import teste.curso.maratonajava.javacore.Bintroducaometodos.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args){
        Funcionario func01 = new Funcionario();

        func01.setNome("João");
        func01.setSalario(new double[]{1200,937.15,18966.48});
        func01.setIdade(23);


        func01.imprime();
        func01.media();
    }
}

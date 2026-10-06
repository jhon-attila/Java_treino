package teste.curso.maratonajava.javacore.Hheranca.test;

import teste.curso.maratonajava.javacore.Hheranca.Domain.Endereco;
import teste.curso.maratonajava.javacore.Hheranca.Domain.Funcionario;
import teste.curso.maratonajava.javacore.Hheranca.Domain.Pessoa;

public class HerancaTest01 {
    static void main(String[] args) {
        Endereco endereco = new Endereco();

        endereco.setCep("12332-456");
        endereco.setRua("blabla");

    Pessoa pessoa = new Pessoa("pessoa");

        pessoa.setCpf("123456789");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        System.out.println("-----------------------");

        Funcionario func = new Funcionario("Nome");
        func.setCpf("23156");
        func.setEndereco(endereco);
        func.setSalario(1234.41);

        func.imprime();;
    }
}

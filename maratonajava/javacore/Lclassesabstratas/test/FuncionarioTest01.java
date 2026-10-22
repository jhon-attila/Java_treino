package teste.curso.maratonajava.javacore.Lclassesabstratas.test;

import teste.curso.maratonajava.javacore.Lclassesabstratas.Domain.Desenvolvedor;
import teste.curso.maratonajava.javacore.Lclassesabstratas.Domain.Funcionario;
import teste.curso.maratonajava.javacore.Lclassesabstratas.Domain.Gerente;

public class FuncionarioTest01 {
    static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor dev = new Desenvolvedor("Luffy", 12000);

        System.out.println(dev);
        System.out.println(gerente);
    }
}

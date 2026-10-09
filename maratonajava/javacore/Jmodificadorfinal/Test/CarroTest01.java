package teste.curso.maratonajava.javacore.Jmodificadorfinal.Test;

import teste.curso.maratonajava.javacore.Jmodificadorfinal.Domain.Carro;
import teste.curso.maratonajava.javacore.Jmodificadorfinal.Domain.Comprador;
import teste.curso.maratonajava.javacore.Jmodificadorfinal.Domain.Ferrari;

public class CarroTest01 {
    static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("JOÃO");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();

    }
}

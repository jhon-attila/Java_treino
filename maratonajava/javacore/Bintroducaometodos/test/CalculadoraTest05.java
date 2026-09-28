package teste.curso.maratonajava.javacore.Bintroducaometodos.test;

import teste.curso.maratonajava.javacore.Bintroducaometodos.domain.Calculadora01;

public class CalculadoraTest05 {
    public static void main(String[] args){
        Calculadora01 calculadora = new Calculadora01();
        int[] numeros = {1,2,3,4,5};

        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1);
    }
}

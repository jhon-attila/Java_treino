package teste.curso.maratonajava.javacore.Bintroducaometodos.test;

import teste.curso.maratonajava.javacore.Bintroducaometodos.domain.Calculadora01;

public class CalculadoraTest03 {
    public static void main(String[] args){
        Calculadora01 calculadora = new Calculadora01();
        double result = calculadora.divideDoiNumeros(20,2);
        System.out.println(result);
        double result02 = calculadora.divideDoiNumeros02(20,0);
        System.out.println(result02);
        System.out.println("-----------------------------");
        calculadora.imprimeDivideDoiNumeros(231,0);
    }
}

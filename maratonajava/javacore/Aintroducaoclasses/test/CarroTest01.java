package teste.curso.maratonajava.javacore.Aintroducaoclasses.test;

import teste.curso.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args){
        Carro carro2 = new Carro();
        Carro carro1 = new Carro();

        carro1.nome = "Juliana";
        carro1.ano = 2008;
        carro1.modelo = "Mercedez";

        carro2.nome = "Bruno";
        carro2.ano = 2013;
        carro2.modelo = "Fiesta";

        System.out.println(carro2.nome);
        System.out.println(carro2.ano);
        System.out.println(carro2.modelo);

        System.out.println(carro1.ano);
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
    }
}

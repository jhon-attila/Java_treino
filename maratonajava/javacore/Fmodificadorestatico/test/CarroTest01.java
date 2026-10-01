package teste.curso.maratonajava.javacore.Fmodificadorestatico.test;

import teste.curso.maratonajava.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180);
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedez", 300);
        Carro c3 = new Carro("BYD", 200);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}

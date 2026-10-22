package teste.curso.maratonajava.javacore.Lclassesabstratas.Domain;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        bonusSalario();
    }
    public void imprime(){
        System.out.println("Imprimindo...");
    }
    public abstract void bonusSalario();
}

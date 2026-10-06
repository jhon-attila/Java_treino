package teste.curso.maratonajava.javacore.Hheranca.Domain;

public class Funcionario extends Pessoa{
    private double salario;

    static{
        System.out.println("Dentro do bloco de inicialização estatico de funcionario 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionario 2");
    }

    {
        System.out.println("Dentro do bloco de inicialização de funcionario 3");
    }

    public Funcionario(String nome){
        System.out.println("Dentro do construtor funcionario");
      super(nome);
    }

    public void imprime(){
        super.imprime();
        System.out.println(salario);
    }

    public void relatorioPagament(){
        System.out.println("Eu "+ this.nome+" recebi o salario de "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

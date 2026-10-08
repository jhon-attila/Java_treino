package teste.curso.maratonajava.javacore.Cadastroescola.Domain;

public class Professor extends Pessoa{
    private double salario;
    private String disciplina;

    public Professor(String nome, String dataNasc, int cpf, double salario, String disciplina) {
        super(nome, dataNasc, cpf);
        this.salario = salario;
        this.disciplina = disciplina;
    }
    public Professor(){

    }

    public void imprime(){
        System.out.println("----- Professor ----");
        super.imprime();
        System.out.println(this.disciplina);
        System.out.println(salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}

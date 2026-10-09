package teste.curso.maratonajava.Cadastroescola.Domain;

public class Aluno extends Pessoa {
    private int matricula;
    private String turma;

    public Aluno(String nome, String dataNasc, int cpf, int matricula, String turma) {
        super(nome, dataNasc, cpf);
    }
    public Aluno(){

    }

    public void imprime(){
        System.out.println("----- Alunos -----");
        super.imprime();
        System.out.println(this.turma);
        System.out.println(this.matricula);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
}

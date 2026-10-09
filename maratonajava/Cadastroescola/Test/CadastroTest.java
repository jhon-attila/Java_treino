package teste.curso.maratonajava.Cadastroescola.Test;

import teste.curso.maratonajava.Cadastroescola.Domain.Aluno;
import teste.curso.maratonajava.Cadastroescola.Domain.Professor;

import java.util.Scanner;

public class CadastroTest {
    static void main(String[] args) {
        Aluno aluno = new Aluno();
        Professor prof = new Professor();
        Scanner output = new Scanner(System.in);

        System.out.println("Deseja cadastrar um Professor ou um Aluno? ");
        String respostas = output.nextLine();

        if(respostas.equals("professor") || respostas.equals("Professor")){
            System.out.println("Nome: ");
            prof.setNome(output.nextLine());

            System.out.println("Data de Nascimento: ");
            prof.setDataNasc(output.nextLine());

            System.out.println("CPF: ");
            prof.setCpf(output.nextInt());

            System.out.println("Disciplina: ");
            output.nextLine();
            prof.setDisciplina(output.nextLine());

            System.out.println("Salario: ");
            prof.setSalario(output.nextDouble());

            prof.imprime();
        }
        if(respostas.equals("aluno") || respostas.equals("Aluno")){
            System.out.println("Nome: ");
            aluno.setNome(output.nextLine());

            System.out.println("Data de Nascimento: ");
            aluno.setDataNasc(output.nextLine());

            System.out.println("CPF: ");
            aluno.setCpf(output.nextInt());

            System.out.println("Turma: ");
            output.nextLine();
            aluno.setTurma(output.nextLine());

            System.out.println("Matricula: ");
            aluno.setMatricula(output.nextInt());

            aluno.imprime();
        }
    }
}

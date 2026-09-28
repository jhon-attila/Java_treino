package teste.curso.maratonajava.javacore.Bintroducaometodos.domain;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(salario != null){
            for(double salarios: salario){
                System.out.println(salarios);
            }
        }

    }
    public void media(){
        if(salario == null){
            return;
        }

            for (double salarios : salario) {
                media = media + salarios;
            }
            media = media / salario.length;
            System.out.println("media: " + media);

    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public double getMedia() {
        return media;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }


}

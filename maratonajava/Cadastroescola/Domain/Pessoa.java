package teste.curso.maratonajava.Cadastroescola.Domain;

public class Pessoa {
    protected String nome;
    protected String DataNasc;
    protected int cpf;

    public Pessoa(){
    }
    public Pessoa(String nome, String dataNasc, int cpf) {
        this.nome = nome;
        DataNasc = dataNasc;
        this.cpf = cpf;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.DataNasc);
        System.out.println(this.cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return DataNasc;
    }

    public void setDataNasc(String dataNasc) {
        DataNasc = dataNasc;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}

package teste.curso.maratonajava.javacore.Kenum.Domain;

import java.lang.classfile.instruction.ReturnInstruction;

public class Cliente {

    private String nome;
    private TipoCliente tipoCliente;
    TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoClienteInt=" + tipoCliente.getValue() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}


package teste.curso.maratonajava.javacore.Kenum.Test;

import teste.curso.maratonajava.javacore.Kenum.Domain.Cliente;
import teste.curso.maratonajava.javacore.Kenum.Domain.TipoCliente;
import teste.curso.maratonajava.javacore.Kenum.Domain.TipoPagamento;

public class ClienteTest01 {
    static void main(String[] args) {
        Cliente cliente1 = new Cliente("lare", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("porta", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("PESSOA FISICA");
        System.out.println(tipoCliente);
    }
}

package teste.curso.maratonajava.TreinoListaDeCompras.Lista;
import teste.curso.maratonajava.TreinoListaDeCompras.Domain.Funcoes;

import java.util.ArrayList;

public class ListaDeCompra {
    public static void main(String[] args){
        Funcoes func = new Funcoes();
        int opcao = 0;
        while(opcao != 5){
            System.out.println("\nLista de Compras!!!");
            System.out.println("Escolha uma opção:\n" +
                    "1 - Adicionar produto\n" +
                    "2 - Remover produto\n" +
                    "3 - Listar produtos\n" +
                    "4 - Pesquisar produto\n" +
                    "5 - Sair");

            opcao = func.lerMensagem(opcao);

            switch (opcao){
                case 1:
                    func.adcionarProdutos();
                    break;
                case 2:
                    func.removerProduto();
                    break;
                case 3:
                    func.listarProdutos();
                    break;
                case 4:
                    func.pesquisarProduto();
                    break;
                case 5:
                    System.out.println("Finalizando...");
                    break;
            }
        }

    }
}

package teste.curso.maratonajava.TreinoListaDeCompras.Domain;
import java.util.Scanner;
import java.util.ArrayList;

public class Funcoes {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> lista = new ArrayList<>();

    public void adcionarProdutos(){
        System.out.println("Adcione o produto: ");
        String produto = scanner.nextLine();
        lista.add(produto);
        listarProdutos();
    }
    public void removerProduto(){
        System.out.println("\nLista: ");
        listarProdutos();
        System.out.println("\nQual produto deseja remover: ");
        String produto = scanner.nextLine();
        if(lista.contains(produto)){
            lista.remove(produto);
        }else{
            System.out.println("Este produto não esta na lista");
        }
    }
    public void listarProdutos(){
        System.out.println("\nLista: ");
        for(String produto : lista){
            System.out.println(produto);
        }
    }
    public void pesquisarProduto(){
        System.out.println("Qual produto esta procurando: ");
        String produto = scanner.nextLine();
        String escolha;
        if(lista.contains(produto)){
            System.out.println("Está na lista!");
        }else{
            System.out.println("Não esta na lista, deseja adcionar(s/n): ");
            escolha = scanner.nextLine();
            if(escolha.equals("s")){
                lista.add(produto);
                listarProdutos();
            }else{
                return;
            }
        }
    }

}

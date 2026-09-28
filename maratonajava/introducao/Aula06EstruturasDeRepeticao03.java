package teste.curso.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args){
        double valorCarro = 50000;
        for(int parcela = (int)valorCarro; parcela >= 1; parcela--){
            double valorParcela = valorCarro / parcela;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela "+ parcela+ " de R$"+ valorParcela);
        }
    }
}

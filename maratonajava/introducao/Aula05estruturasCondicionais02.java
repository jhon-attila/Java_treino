package teste.curso.maratonajava.introducao;

public class Aula05estruturasCondicionais02 {
    public static void main(String[] args){
        double salario = 3000;
        //String mensagemDoar = "Vou dar 500 pro carinha";  1
        //String mensagemNaoDoar = "não quero doar";
        //String resultado = (condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? "Vou dar 500 pro carinha" : "não quero doar";
        /*
        if(salario > 5000){
            resultado = mensagemDoar;
        }else{
            resultado = mensagemNaoDoar;
        }
         */
        System.out.println(resultado);
    }
}

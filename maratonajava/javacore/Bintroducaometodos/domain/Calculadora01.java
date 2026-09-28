package teste.curso.maratonajava.javacore.Bintroducaometodos.domain;

public class Calculadora01 {
    public  void somaDoisNumeros(){

        System.out.println(10+10);
    }
    public void subtraiDoisNumeros(){
        System.out.println(21-2);
    }
    public void multiplicaDoisNumeros(double num1, double num2){
        System.out.println(num1*num2);
    }
    public double divideDoiNumeros(double num1, double num2){
        if(num1 == 0 || num2 == 0){
            return 0;
        }
        return num1/num2;
    }
    public double divideDoiNumeros02(double num1, double num2){
        if(num1 == 0 || num2 == 0){
            return 0;
        }else{
            return num1/num2;
        }
    }
    public void imprimeDivideDoiNumeros(double num1, double num2){
        if(num2 == 0 || num1 == 0){
            System.out.println("Não existe divisão por 0");
            return;
        }
            System.out.println(num1/num2);
    }
    public void alteraDoisNumeros (int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("num1 "+num1);
        System.out.println("num2 "+num2);
    }
    public void somaArray(int[] numeros){
        int soma = 0;
        for(int temp: numeros){
            soma+= temp;
        }
        System.out.println(soma);
    }
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int temp: numeros){
            soma+= temp;
        }
        System.out.println(soma);
    }
}

package teste.curso.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args){
        var num1 = 10;
        var num2 = 20.0;
        var soma = num1 + num2;
        // ou
        System.out.println(num1 / num2);

        var num = 942313;
        num %= 2;

        if(num == 0){
            System.out.println("par");
        }else{
            System.out.println("impar");
        }

        // &&(AND) || (OR)

        var idade = 18;
        var salario = 1621;
        if(idade >= 17 && salario >= 1621){
            System.out.println("tudo dentro da lei");
        }else{
            System.out.println("isso é CRIME!!!");
        }
    }
}

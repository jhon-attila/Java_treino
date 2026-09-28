package teste.curso.maratonajava.introducao;

public class Aula05estruturasCondicionaisExercicio02 {
    //Utilizando switch e dados os valores de 1 a 7, imprima se é dia util ou final de seamna
    // Consideere 1 como domingo
    public static void main(String[] args){
        var dia = 1;

        switch (dia){
            case 1:
                System.out.println("Hoje é domingo. Final de semana");
                break;
            case 2:
                System.out.println("Hoje é segunda. Dia útil");
                break;
            case 3:
                System.out.println("Hoje é terça. Dia útil");
                break;
            case 4:
                System.out.println("Hoje é quarta. Dia útil");
                break;
            case 5:
                System.out.println("Hoje é quinta. Dia útil");
                break;
            case 6:
                System.out.println("Hoje é sexta. Dia útil");
                break;
            case 7:
                System.out.println("Hoje é sabado. Final de semana");
                break;
            default:
                System.out.println("Não é um valor aceitavel");
                break;
        }
    }
}

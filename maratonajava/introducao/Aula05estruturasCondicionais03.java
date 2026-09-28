package teste.curso.maratonajava.introducao;

public class Aula05estruturasCondicionais03 {
    public static void main(String[] args) {
        var dia = 312;
        // só pdoe caolocar char, int, short enum, String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
                default:
            System.out.println("opção invalida");
            break;
        }
        var sexo = 'M';
        switch (sexo){
            case 'M':
                System.out.println("Homi");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("opção invalida");
        }
    }
}

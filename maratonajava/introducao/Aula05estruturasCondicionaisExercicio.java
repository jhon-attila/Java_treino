package teste.curso.maratonajava.introducao;

public class Aula05estruturasCondicionaisExercicio {
    public static void main(String[] args){
        var salarioAnual = 350000;
        double taxa;

        if(salarioAnual < 35000){
            taxa = (salarioAnual * 9.7) / 100;
        }else if(salarioAnual >= 35000 && salarioAnual < 69000){
            taxa = (salarioAnual * 37) / 100;
        }else {
            taxa = (salarioAnual * 50) / 100;
        }
        System.out.println("eu pago anualmente uma taxa de "+taxa+" reais");
    }
}

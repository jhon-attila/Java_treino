package teste.curso.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] agrs){
        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "vitor";
        nomes[2] = "juliana";
        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
        nomes = new String[5];
    }
}

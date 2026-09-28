package teste.curso.maratonajava.introducao;

public class Aula02_TiposPrimitivos {
    public static void main(String[] args){
        // int, double, float, cat, byte, short, long, boolean. Pode ser apenas var
        int age = 10;
        double wageDouble = 1621.50D;
        float wageFloat = 2500.50F;
        byte ageByte = 127;
        short ageShort = 32767;
        boolean verdadeiro = true;
        boolean falso = false;
        long numberBig = 1000000000L;
        char caractere = 'M';
        var name2 = 1222222;
        String name = "joão";
        System.out.println("A idade é "+age+" anos");
        System.out.println(verdadeiro);
        System.out.println(wageDouble);
        System.out.println(wageFloat);
        System.out.println(numberBig);
        System.out.println("meu nome é "+name);

    }
}

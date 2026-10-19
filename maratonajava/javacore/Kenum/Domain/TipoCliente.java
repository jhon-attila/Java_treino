package teste.curso.maratonajava.javacore.Kenum.Domain;

public enum TipoCliente {
    PESSOA_FISICA(1, "PESSOA FISICA"),
    PESSOA_JURIDICA(2, "PESSOA JURIDICA");

    private final String nomeRelatorio;
    private final int Value;

    TipoCliente(int value, String nomeRelatorio) {
        this.Value = value;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
        for (TipoCliente tipoCliente : values()) {
            if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

    public int getValue() {
        return Value;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}

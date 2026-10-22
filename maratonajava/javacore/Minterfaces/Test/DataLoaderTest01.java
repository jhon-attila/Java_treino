package teste.curso.maratonajava.javacore.Minterfaces.Test;

import teste.curso.maratonajava.javacore.Minterfaces.Domain.DatabaseLoader;
import teste.curso.maratonajava.javacore.Minterfaces.Domain.FileLoader;

public class DataLoaderTest01 {
    static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        databaseLoader.remove();
        fileLoader.load();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}

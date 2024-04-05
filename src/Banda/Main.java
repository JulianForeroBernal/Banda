package Banda;

public class Main {
    public static void main(String[] args) {
        Banda banda = new Banda(); // se crea un objeto de tipo banda que tiene todas la funciones creoada en el archivo "Banda"
        banda.generarBanda(5);
        banda.afinarBanda();
        banda.tocarBanda();
    }
}

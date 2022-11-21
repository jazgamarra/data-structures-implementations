package PackageListasEstaticas.excepciones;

public class ListaLlenaException extends Exception {
    public ListaLlenaException() {
        super("La lista esta llena!");
    }
}

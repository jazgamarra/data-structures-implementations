package PackageColasEstaticas.excepciones;

public class ColaLlenaException extends Exception {
    public ColaLlenaException () {
        super("La cola esta llena unu");
    }
}

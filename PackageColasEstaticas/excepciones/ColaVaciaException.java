package PackageColasEstaticas.excepciones;

public class ColaVaciaException extends Exception {
    public ColaVaciaException ()  {
        super("La cola esta vacia ");
    }
}

package PackagePilas.excepciones;

public class PilaVaciaException extends Exception {
    public PilaVaciaException() {
        super("La lista esta vacia :c");
    }
}

package PackageColas.excepciones;

public class ColaVaciaException extends Exception {
    public ColaVaciaException() {
        super("La lista esta vacia :c");
    }
}

package PackageListasEstaticas.excepciones;

public class PosicionFueraRangoException extends Exception {
    public PosicionFueraRangoException() {
        super("La posicion esta fuera de rango");
    }
}

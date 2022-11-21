package PackagePilas;

public class PruebaPila {
    public static void main(String[] args) {
        Pilas <String> p1 = new Pilas <> ();

        p1.apilar("Hola");
        p1.apilar("mundo");

        p1.mostrarDatos();

        try {
            p1.desapilar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        p1.apilar("Ivan");
        p1.mostrarDatos();

    }
}

package PackageColas;

public class PruebaCola {
    public static void main(String[] args) {
        Colas <String> c1 = new Colas<>();

        c1.encolar("a");
        c1.encolar("b");

        imprimir(c1);

        try {
            c1.descolar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        c1.encolar("c");

        imprimir(c1);

        System.out.println("c esta en la posicion "+c1.buscar("b"));

        try {
            System.out.println("el primero es "+c1.consultar());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void imprimir(Colas c1) {
        System.out.println("---------------------");
        for (Object elemento: c1.toArray()) {
            System.out.println(elemento);
        }
    }
}

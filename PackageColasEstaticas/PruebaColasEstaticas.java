package PackageColasEstaticas;

public class PruebaColasEstaticas {
    public static void main(String[] args) {
        ColaEstatica <Integer> col = new ColaEstatica<Integer>(5);

        try {
            col.insertar(1);
            col.insertar(2);
            col.insertar(3);

            col.mostrarDatos();

            col.atender();

            col.mostrarDatos();

            System.out.println("Siguiente en ser atendido: "+col.consultar());
            System.out.println("Longitud de la cola: "+ col.size());
            System.out.println("2 esta en la posicion: "+col.buscar(2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}

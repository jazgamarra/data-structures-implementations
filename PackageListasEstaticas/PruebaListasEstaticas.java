package PackageListasEstaticas;

public class PruebaListasEstaticas {
    public static void main(String[] args) {
        int N = 10;
        ListaEstatica <Integer> listaEst = new ListaEstatica<Integer>(N);

        try {
            listaEst.insertar(1);
            listaEst.insertar(7,  1);
            listaEst.insertar(6, 4);
            listaEst.insertar(2);

            impresion(listaEst);

            listaEst.suprimir(2);
            impresion(listaEst);

            listaEst.suprimir();
            impresion(listaEst);



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void impresion(ListaEstatica <Integer> listaEst) {
        System.out.println("\n----------------------------");
        for (int i = 0; i < listaEst.longitud; i++) {
            try {
                System.out.print("   "+listaEst.consultar(i));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

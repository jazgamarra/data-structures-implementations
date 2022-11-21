package PackageColasEstaticas;

import PackageColasEstaticas.excepciones.ColaLlenaException;
import PackageColasEstaticas.excepciones.ColaVaciaException;

public class ColaEstatica <T> implements InterfaceColaEstatica <T> {
    T cola [];

    // ElementosInsertados cuenta, desde 0 hastas longitud-1, cuantos elementos ya se insertaron n el vector.
    // Ademas, coincide con la posicion del ultimo elemento insertado en el vector
    // El valor -1 en elementosInsertados indica que no se insertaron elementos en el vector

    int longitud, elementosInsertados;

    public ColaEstatica (int cant) {
        iniciar(cant);
    }

    public void iniciar(int cantElementos) {
        cola = (T[]) new Object [cantElementos];
        longitud = cantElementos;
        elementosInsertados = -1;
    }

    public void insertar(T elemento) throws ColaLlenaException {
        if (isFull()) throw new ColaLlenaException();

        // elementosInsertados coincide con la posicion en la que se inserto el ultimo elemento
        // entonces incrementamos e insertamos en esa posicion

        elementosInsertados++;
        cola[elementosInsertados] = elemento;

    }

    public T atender() throws ColaVaciaException {
        if (isEmpty()) throw new ColaVaciaException();

        T atendido = cola [0];

        // Para eliminar el primer elemento, corro todos los elementos insertados una posicion.
        for (int i = 0; i <= elementosInsertados; i++) {
            cola[i]=cola[i+1];
        }

        elementosInsertados--;
        return atendido;
    }

    public T consultar() throws ColaVaciaException {
        if (isEmpty()) throw new ColaVaciaException();

        return cola[0];
    }

    public int buscar(T dato) {

        int pos = -1;

        for (int i = 0; i <= elementosInsertados; i++) {
            if (dato.toString().equals(cola[i].toString())) {
                pos = i;
                break;
            }
        }

        return pos;
    }

    public boolean isEmpty() {
        return elementosInsertados==-1;
    }

    public boolean isFull() {
        return elementosInsertados == longitud-1;
    }

    public int size() {
        return longitud;
    }

    public void mostrarDatos () {
        System.out.println("--------------------------");
        for (int i = 0; i <= elementosInsertados ; i++) {
            System.out.print("  "+cola[i]);
        }
        System.out.println();
    }
}

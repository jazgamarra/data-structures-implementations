package PackageColas;

import PackageColas.excepciones.ColaVaciaException;
import PackagePilas.Nodo;

public class Colas <T> implements InterfaceCola <T>{

    // Declarar atributos
    Nodo<T> primero;
    Nodo<T> ultimo;
    int longitud;

    public void iniciar() {
        primero = ultimo = null;
        longitud = 0;
    }

    public void encolar(T dato) {
        Nodo <T> nuevo = new Nodo<>(dato);

        if (isEmpty()) {
            primero = ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
        longitud++;
    }

    public T descolar() throws ColaVaciaException {
        if (isEmpty()) throw new ColaVaciaException();

        T despachado = primero.getDato();

        Nodo <T> segundo = primero.getSiguiente();
        primero = segundo;

        longitud --;

        return despachado;
    }

    public T consultar() throws ColaVaciaException {
        if (isEmpty()) throw new ColaVaciaException();

        return primero.getDato();
    }

    public boolean isEmpty() {
        return longitud == 0;
    }

    public int buscar(T dato) {
        int pos = -1;
        Nodo <T> auxiliar = primero;
        for (int i = 1; i <= longitud; i++) {
            if (dato.toString().equals(auxiliar.getDato().toString())) {
                pos = i;
                break;
            }
            auxiliar = auxiliar.getSiguiente();
        }
        return pos;
    }

    public int size() {
        return longitud;
    }

    public Object[] toArray() {
        T [] vector = (T[]) new Object[longitud];

        Nodo <T> auxiliar = primero;
        for (int i = 1; i <= longitud; i++) {
            vector [i-1] = auxiliar.getDato();
            auxiliar = auxiliar.getSiguiente();
        }
        return vector;
    }
}

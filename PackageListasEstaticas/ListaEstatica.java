package PackageListasEstaticas;

import PackageListasEstaticas.excepciones.ListaLlenaException;
import PackageListasEstaticas.excepciones.ListaVaciaException;
import PackageListasEstaticas.excepciones.PosicionFueraRangoException;

import java.util.Arrays;


public class ListaEstatica <T> implements InterfaceListaVector <T> {

    T[] vector;
    int longitud;
    int elementosInsertados;

    /*
    * 10 elementos
    * Longitud: 0 - 9;
    * Insertados: 1 - 10;
    *
    *( longitud == insertados-1 )
    * */

    public ListaEstatica (int cant) {
        iniciar(cant);
    }

    public void iniciar(int cant) {
        vector =(T[]) new Object[cant];
        longitud = cant;
        elementosInsertados = 0;
    }

    // Insertar, recibe dato y posicion -> insertar en el medio
    public void insertar(T dato, int pos) throws PosicionFueraRangoException, ListaLlenaException {
        if (pos<0 || pos>longitud) throw new PosicionFueraRangoException();
        if (estaLlena()) throw new ListaLlenaException();

        // Correr los elementos una posicion
        /*Recorres de atras para delante, desde longitud-1 hasta pos.
          Asignas a v[i] el valor de v[i-1]*/
        for (int i = longitud - 1; i >= pos; i--) {
            vector [i] = vector[i-1];
        }

        vector [pos] = dato;
        elementosInsertados ++;
    }

    // Insertar: no recibe pos. -> insertar al final
    public void insertar(T dato) throws ListaLlenaException {
        if (estaLlena()) throw new ListaLlenaException();

        for (int i = 0; i < longitud; i++) {
            if (vector[i] == null) {
                vector[i] = dato;
                elementosInsertados++;
                break;
            }
        }
    }

    // Suprimir:  nos indica la posicion en la que esta lo que debemos eliminar
    public T suprimir(int pos) throws PosicionFueraRangoException, ListaVaciaException {
        if (pos<0 || pos>longitud) throw new PosicionFueraRangoException();
        if (estaVacia()) throw new ListaVaciaException();

        T eliminado = vector[pos];
        for (int i = pos; i < elementosInsertados; i++) {
            vector[i] = vector [i+1];
        }

        // n elementos insertados
        // al borrar un elemento
        // elementosInsertados -1 pasa a ser null
        // para liberar espacio

        elementosInsertados--;
        vector[elementosInsertados] = null;

        return eliminado;
    }

    // Suprimir el ultimo elemento de la lista
    public T suprimir() throws ListaVaciaException {
        if (estaVacia()) throw new ListaVaciaException();

        T eliminado = null;
        for (int i = longitud-1; i>=0 ; i--) {
            if (vector[i] != null) {
                eliminado = vector[i];
                vector[i] = null;
                break;
            }
        }

        elementosInsertados--;

        return eliminado;
    }

    public T consultar(int pos) throws ListaVaciaException, PosicionFueraRangoException {
        if (pos<0 || pos>longitud) throw new PosicionFueraRangoException();
        if (estaVacia()) throw new ListaVaciaException();

        return vector[pos];
    }

    public boolean estaVacia() {
        return elementosInsertados == 0;
    }

    public boolean estaLlena() {
        return longitud == elementosInsertados-1;
    }

    public int buscar(T dato) {
        int pos = -1;
        for (int i = 0; i < longitud; i++) {
            if (dato.toString().equals(vector[i].toString())) {
                pos = 1;
                break;
            }
        }
        return pos;
    }

    public int tamanho() {
        return longitud;
    }

    public T[] ordenar() {
        Arrays.sort(vector);
        return vector;
    }
}

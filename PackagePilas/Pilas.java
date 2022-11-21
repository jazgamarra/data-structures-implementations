package PackagePilas;

import PackagePilas.excepciones.PilaVaciaException;

public class Pilas <T> implements InterfacePilaDinamica <T>{
    // Atributos o variables
    Nodo <T> primero;
    Nodo <T> ultimo;
    int longitud;

    public void iniciar() {
        primero = ultimo = null;
        longitud = 0;
    }

    public void apilar(T dato) {
        Nodo <T> nuevoNodo = new Nodo<>(dato);

        // si es el primero...
        if (isEmpty()) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            ultimo.setSiguiente(nuevoNodo);
        }
        longitud++;
    }

    public T desapilar() throws PilaVaciaException {
        if (isEmpty()) throw new PilaVaciaException();

        // guardar para retornar
        T eliminado = ultimo.getDato();

        // recorrer hasta quedarnos en el penultimo
        Nodo <T> auxiliar = primero;
        for (int i = 1; i < longitud-1; i++) {
            auxiliar = auxiliar.getSiguiente();
        }

        // procedemos a eliminar xd
        auxiliar.setSiguiente(null);
        longitud--;
        return eliminado;
    }

    public T consultar() throws PilaVaciaException {
        if (isEmpty()) throw new PilaVaciaException();
        return ultimo.getDato();
    }

    public boolean isEmpty() {
        return longitud == 0;
    }

    public int buscar(T dato) {
        int pos = -1;
        Nodo <T> auxiliar = primero;
        for (int i = 1; i < longitud; i++) {
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

    public void mostrarDatos () {
        Nodo <T> auxiliar = primero;
        for (int i = 1; i <= longitud; i++) {
            System.out.print(" "+auxiliar.getDato());
            auxiliar = auxiliar.getSiguiente();
        }
    }
}

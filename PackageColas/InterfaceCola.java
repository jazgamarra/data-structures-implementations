package PackageColas;

import PackageColas.excepciones.*;
/**
* Interface que deben implementar la estructura Cola din�mica,
* utilizando Nodos
*/
public interface InterfaceCola<T> {
    public void iniciar();
    public void encolar(T dato);
    public T descolar() throws  ColaVaciaException;
    public T consultar() throws ColaVaciaException;
    public boolean isEmpty();
    public int buscar(T dato);
    public int size();
	/**
	* Devuelve los elementos de la cola como un array de Objetos
	*/
	public Object[] toArray();
}
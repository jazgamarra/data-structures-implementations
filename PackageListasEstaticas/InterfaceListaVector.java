package PackageListasEstaticas;

import PackageListasEstaticas.excepciones.*;  //en este paquete de crear las excepciones
/**
* Interface a ser implementada por la clase Lista usando array
* con datos genericos.
*/
public interface InterfaceListaVector<T> {
      
  /**
   * inicia la estructura con la cant indicada de elementos
   */
  public void iniciar(int cant);

  /**
   * inserta el dato en la pos indicada, si la pos no est� libre
   * debe mover los elementos para insertar en la pos
   * si la lista est� llena debe lanzar ListaLlenaException
  */
  public void insertar(T dato, int pos)  
              throws PosicionFueraRangoException, ListaLlenaException;

  /**
   * inserta el dato despues del ultimo elemento insertado,
   * si no existe lugar libre lanza ListaLlenaException
   */
  public void insertar(T dato)
            throws ListaLlenaException;

  /**
   * elimina y devuelve el objeto que est� en pos, si existe 
   * si no existe, lanza PosicionFueraRangoException
   * Si la lista esta vac�a lanza ListaVaciaException
  */
  public T suprimir(int pos) throws  PosicionFueraRangoException, 
						ListaVaciaException;

  /**
   * elimina y retorna el dato que se encuentra como primer elemento
   */
  public T suprimir() throws ListaVaciaException;

  /**
   * devuelve sin sacar el dato que se encuentra en pos,
   */
  public T consultar(int pos) throws ListaVaciaException,
                PosicionFueraRangoException;

  /**
   * devuelve true si la estructura esta vac�a
   */
  public boolean estaVacia();
  /**
   * devuelve true si la estructura estallena
   */
  public boolean estaLlena();

   /**
    * busca un elemento y devuelve su ubicaci�n en la lista si existe, 
	* siendo 1 el primer elemento
    * retorna 0 si no existe (o la lista esta vacia)
    */ 
  public int buscar(T dato);

  /**
   * devuelve el tama�o de la estructura, no la capacidad del vector
   */
  public int tamanho();

  /**
   * devuelve un nuevo vector con los elementos ordenados
   * el vector original no debe ordenarse
   */
  public Object[] ordenar();
}
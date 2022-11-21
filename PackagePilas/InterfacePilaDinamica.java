package PackagePilas;
import PackagePilas.excepciones.*;

public interface InterfacePilaDinamica<T>{
   public void iniciar();
   public void apilar(T dato);
   public T desapilar() throws PilaVaciaException;
   public T consultar() throws PilaVaciaException;
   public boolean isEmpty();
   public int buscar(T dato);
   public int size();
}


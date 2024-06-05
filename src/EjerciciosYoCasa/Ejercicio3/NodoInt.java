package EjerciciosYoCasa.Ejercicio3;
public class NodoInt {
    public int dato;
    public NodoInt siguiente;

    public NodoInt(int dato){
        this.dato = dato;
        siguiente = null;
    }
    public NodoInt(int dato, NodoInt siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }
}

package Nose;

public class NodoInt {

    NodoInt siguiente;

    int dato;

    public NodoInt(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public NodoInt(NodoInt nodo, int dato){
        this.dato = dato;
        siguiente = nodo;
    }
}

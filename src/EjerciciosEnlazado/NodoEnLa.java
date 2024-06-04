package EjerciciosEnlazado;

import EjerciciosArrays.Nodo;

public class NodoEnLa {
    int dato;
    NodoEnLa siguiente;

    public NodoEnLa(int dato){
        this.dato = dato;
        siguiente =null;
    }
    public NodoEnLa(int dato, NodoEnLa siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }
}

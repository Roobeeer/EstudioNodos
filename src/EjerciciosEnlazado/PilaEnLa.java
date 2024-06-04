package EjerciciosEnlazado;

import EjerciciosArrays.Nodo;

public class PilaEnLa {
    private NodoEnLa ultimo;

    public PilaEnLa() {
        ultimo = null;
    }

    public void apilar(int x) {
        NodoEnLa nodoNuevo = new NodoEnLa(x, ultimo);
        ultimo = nodoNuevo;
    }

    public int desapilar() {
        if (ultimo == null) {
            throw new RuntimeException("Lista vacía");
        }else{
            int aux = ultimo.dato;
            ultimo = ultimo.siguiente;
            return aux;
        }
    }
}


package EjerciciosEnlazado;

import EjerciciosArrays.Nodo;

public class ListaEnLa {
    private NodoEnLa primero;
    private int size;

    public ListaEnLa() {
        primero = null;
        size = 0;
    }

    public void enlistar(int pos, int dato) {
        if (pos == 0 || size == 0) {
            primero = new NodoEnLa(dato, primero);
        } else if (pos > size) {
            NodoEnLa aux = primero;
            for (int j = 0; j < size - 1; j++) {
                aux = aux.siguiente;
            }
            aux.siguiente = new NodoEnLa(dato);
        } else {
            NodoEnLa aux = primero;
            for (int j = 0; j < pos - 1; j++) {
                aux = aux.siguiente;
            }
            NodoEnLa siguienteAux = aux.siguiente;
            NodoEnLa nuevo = new NodoEnLa(dato, siguienteAux);
            aux.siguiente = nuevo;
        }
        size++;
    }

    public void pasarLista() {
        NodoEnLa aux = primero;
        for (int i = 0; i < size; i++) {
            System.out.println(aux.dato);
            aux = aux.siguiente;
        }
    }


    public boolean esVacia() {
        return size == 0;
    }

    public int getSize() {
        return this.size;
    }
}

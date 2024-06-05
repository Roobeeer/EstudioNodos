package EjerciciosYoCasa.Ejercicio2;

import EjerciciosArrays.Nodo;

public class ColaIntEnLa {
    private static int MAX_SIZE = 10;
    private NodoInt primero;
    private NodoInt ultimo;
    int tallaImag = 0;

    public void encolar(int x){
        NodoInt nodoNuevo = new NodoInt(x);
        if(tallaImag == 0){
            primero = nodoNuevo;
        }
        if(tallaImag!= 0){
            ultimo.siguiente = nodoNuevo;
        }
        ultimo = nodoNuevo;
        tallaImag++;
    }

    public int desencolar(){
        if(tallaImag == 0){
            throw new RuntimeException("Error, la cola esta vacía y no se puede desencolar");
        }
        if(tallaImag == 1){
            ultimo = null;
        }
        int datoprimero = primero.dato;
        primero = primero.siguiente;
        tallaImag--;
        return datoprimero;


    }

    public void invertir() {
        if (tallaImag == 0) {
            // Handle empty queue case (e.g., print message or return)
            return;
        }

        NodoInt[] array = new NodoInt[tallaImag]; // Use actual queue size
        NodoInt aux = primero;
        int count = 0;
        while (aux != null) {
            array[count] = aux;
            aux = aux.siguiente;
            count++;
        }

        // Reverse the elements in the array (using count)
        for (int j = 0; j < count / 2; j++) {
            NodoInt temp = array[j];
            array[j] = array[count - j - 1];
            array[count - j - 1] = temp;
        }

        // Update queue pointers using the reversed array
        primero = array[0];
        ultimo = array[count - 1];
        for (int j = 0; j < count - 1; j++) {
            array[j].siguiente = array[j + 1];
        }
        array[count - 1].siguiente = null;
    }

}

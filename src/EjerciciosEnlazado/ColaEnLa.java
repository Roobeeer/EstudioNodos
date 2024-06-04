package EjerciciosEnlazado;

public class ColaEnLa {
    private NodoEnLa primero;
    private NodoEnLa ultimo;
    private int tamanyo;

    public ColaEnLa() {
        primero = null;
        ultimo = null;
        tamanyo = 0;
    }

    public void encolar(int x) {
        NodoEnLa nodoNuevo = new NodoEnLa(x);
        if (esVacia()) {
            primero = nodoNuevo;
        } else {
            ultimo.siguiente = nodoNuevo;
        }
        ultimo = nodoNuevo;
        tamanyo++;
    }

    public int desencolar() {
        if (esVacia()) {
            throw new RuntimeException("La cola esta vacía, no se puede desencolar");
        }
        if(tamanyo == 1){
            ultimo = null;
        }
        int datoprimero = primero.dato;
        primero = primero.siguiente;
        tamanyo--;
        return datoprimero;
    }

    public void invertir(){
        int[] array = new int[tamanyo];
        int tamanyoActual = tamanyo;
        for(int i = 0;i<tamanyoActual;i++){
            array[i] = desencolar();
        }
        for(int i = tamanyoActual-1;i>=0;i--){
            encolar(array[i]);
        }

    }

    public boolean esVacia() {
        return tamanyo == 0;
    }

    public int getTamanyo() {
        return this.tamanyo;
    }

}

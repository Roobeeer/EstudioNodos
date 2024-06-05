package EjerciciosYoCasa.Ejercicio3;

import EjerciciosArrays.Nodo;

class ColaIntEnLa{
    private NodoInt primero, ultimo;
    private int talla;

    public ColaIntEnLa(){
        primero = null;
        ultimo = null;
        talla = 0;
    }

    public boolean  esVacia(){
        return primero ==null;
    }
    public void encolar(int x){
        NodoInt nodoNuevo = new NodoInt(x);
        if(esVacia()) {
            primero = nodoNuevo;

        }if(!esVacia()){
            ultimo.siguiente = nodoNuevo;
        }
        ultimo = nodoNuevo;
        talla++;
    }

    public int desencolar(){
        int aux = primero.dato;
        primero = primero.siguiente;
        if(esVacia()){
            ultimo = null;
        }
        talla--;
        return aux;
    }

    public void abandon(int pos){
        if(talla == 0){
            throw new RuntimeException("Error, la cola esta vacía");
        } else if (pos<0 && pos>=talla) {
            throw new RuntimeException("Error, la posición no es válida");
        }else if(pos==0){
            primero = primero.siguiente;
        }else{
            NodoInt aux = primero;
            for (int i = 0; i <pos-1 ; i++) {
                aux = aux.siguiente;
            }
            aux = aux.siguiente.siguiente;
        }
        talla--;
    }
}
package Nose;

public class Cola {

    private NodoInt primero;

    private NodoInt ultimo;

    private int talla;

    public Cola() {
        primero = null;
        ultimo = null;
        talla = 0;
    }

    public void encolar(int dato) {
        NodoInt nuevo = new NodoInt(dato);
        if (primero == null) {
            primero = nuevo;
        } else {
            ultimo.siguiente = nuevo;
        }
        ultimo = nuevo;
        talla++;
    }




}

package EjerciciosArrays;

import javax.swing.*;
import java.util.*;

public class Pila {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce una opción del 1 al 4");
        System.out.println("1. Introduce un nodo\n2.Elimina un nodo\n3.Comprueba valores de la pila\n4.Ultimo valor ingresado");
        int opcion = tec.nextInt();
        Pila pila1 = new Pila();
        int n = tec.nextInt();
        switch(opcion){
            case 1:
                pila1.InsertarNodo(n);
                break;
            case 2:
                pila1.EliminarNodo();
                break;
            case 3:
                pila1.MostrarContenidoPila();
                break;
            case 4:
                pila1.MostrarUltimoValorIngresado();
                break;
            default:
                System.out.println(0);
        }
        opcion = tec.nextInt();
    }
    private Nodo UltimoValorIngresado;
    int tamanyo = 0;
    String lista = "";

    public Pila(){
        this.tamanyo =0;
        this.UltimoValorIngresado = null;
    }

    public boolean esVacia(){
        boolean vacio = true;
        if(UltimoValorIngresado == null){
            vacio = false;
            System.out.println("La lista esta vacía");
        }
        return vacio;
    }


    public void InsertarNodo(int nodo){
        Nodo nodo1 = new Nodo(nodo);
        nodo1.siguiente = UltimoValorIngresado;
        tamanyo++;
    }

    public int EliminarNodo(){
        int aux = UltimoValorIngresado.dato;
        UltimoValorIngresado = UltimoValorIngresado.siguiente;
        tamanyo--;
        return aux;
    }



    public int MostrarUltimoValorIngresado(){
        return UltimoValorIngresado.dato;
    }


    public int TamanyoPila(){
        return tamanyo;
    }

    public void VaciarPila(){
        while(!esVacia()){
            EliminarNodo();
        }
    }

    public void MostrarContenidoPila(){
        Nodo recorrido = UltimoValorIngresado;
        while(recorrido != null){
            lista += recorrido.dato + "\n";
            recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null,lista);
        lista = "";
    }
}

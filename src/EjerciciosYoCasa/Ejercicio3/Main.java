package EjerciciosYoCasa.Ejercicio3;

import EjerciciosYoCasa.Ejercicio2.ColaIntEnLa;

public class Main {
    public static void main(String[] args) {
         int MAX_SIZE = 2;
        EjerciciosYoCasa.Ejercicio2.ColaIntEnLa cola1 = new ColaIntEnLa();
        for(int i = 0;i<2;i++){
            cola1.encolar(3);
        }
        cola1.invertir();
        for (int i = 0; i <2; i++) {
            System.out.println(cola1.desencolar());
        }
    }

}

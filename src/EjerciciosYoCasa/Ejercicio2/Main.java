package EjerciciosYoCasa.Ejercicio2;

public class Main {
    public static void main(String[] args) {
         int MAX_SIZE = 2;
        ColaIntEnLa cola1 = new ColaIntEnLa();
        for(int i = 0;i<2;i++){
            cola1.encolar(3);
        }
        cola1.invertir();
        for (int i = 0; i <2; i++) {
            System.out.println(cola1.desencolar());
        }
    }

}

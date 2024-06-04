package EjerciciosEnlazado;

public class Main {
    public static void main(String[] args) {
                PilaEnLa pila1 = new PilaEnLa();
                for(int i = 0;i<101;i++){
                    pila1.apilar(3);
                }
                for(int i = 0;i<100;i++){
                    System.out.println(pila1.desapilar());
                }

            }
}


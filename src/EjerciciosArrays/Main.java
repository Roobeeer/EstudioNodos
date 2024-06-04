package EjerciciosArrays;

public class Main {
    public static void main(String[] args) {
        PilaIntArray pila1 = new PilaIntArray(1);
        for(int i = 0;i<10;i++){

            pila1.apilar(3);
        }
        for(int i = 0;i<10;i++){
            System.out.println(pila1.desapilar());
        }

    }
}

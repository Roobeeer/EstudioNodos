package EjerciciosEnlazado;

public class MainCola {
    public static void main(String[] args) {
        ColaEnLa cola1 = new ColaEnLa();
        cola1.encolar(3);
        cola1.encolar(5);
        cola1.encolar(7);
        cola1.encolar(9);
        cola1.invertir();
        // int tamanyo = cola1.getTamanyo();
        //for(int i = 0;i<tamanyo;i++){
        //System.out.println(cola1.desencolar());
        //}
        while (!cola1.esVacia()) {
            System.out.println(cola1.desencolar());
        }


    }
}


package EjerciciosArrays;

public class PilaIntArray {
    private int array[];
    private int ultimo;
    private static int MAX_SIZE;
    public PilaIntArray(int MAX_SIZE){
        this.MAX_SIZE = MAX_SIZE;
        array = new int[MAX_SIZE];
        ultimo = -1; // Apunta al vacio

    }

    public int apilar(int x){
        if(ultimo >=MAX_SIZE-1){
            int[] array2 = new int[MAX_SIZE*2];
            for(int i = 0;i<MAX_SIZE;i++){
                array2[i] = array[i];
            }
            array = array2;
            MAX_SIZE = MAX_SIZE*2;
        }
        array[ultimo+1] = x;
        ultimo++;
        return ultimo;
    }
    public int desapilar(){
        int aux = array[ultimo];
        array[ultimo] = 0;
        ultimo = ultimo-1;
        return aux;

    }

}


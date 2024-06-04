package EjerciciosYoCasa.Ejercicio1;

public class PilaIntArray {
    private static int MAX_SIZE = 10;
    public int[] array;
    private int ultimo;

    public PilaIntArray(int MAX_SIZE){
        array = new int[MAX_SIZE];
        this.MAX_SIZE = MAX_SIZE;
        ultimo = -1;
        }
    public int apilar(int x){
    if(ultimo>=MAX_SIZE-1){
        int newSize = MAX_SIZE*2;
        int[]array2 = new int[newSize];
        for(int i = 0;i<MAX_SIZE;i++){
            array2[i] = array[i];
        }
        array = array2;
        MAX_SIZE = newSize;
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

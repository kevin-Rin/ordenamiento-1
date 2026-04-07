
import java.util.*;

public class Ordenamiento {
    public static void main(String[] args) {
        
        System.out.println("ingrese el tamaño del arreglo");
        
        Scanner teclado = new Scanner(System.in);
        Random rand = new Random();
        int n = teclado.nextInt();  
        int arr[] = new int [n];
        
        for (int i = 0; i < n; i++){  
        arr[i]= rand.nextInt(100);
        
        }
         ordenar(arr);
        System.out.println(java.util.Arrays.toString(arr));
        
    }
    private static void ordenar(int v[]) {
        for (int i = 0; i < v.length-1; i++) {
            for (int j = i+1; j < v.length ; j++) {
                if (v[i] > v[j]) {
                    int w = v[j];
                    v[j] = v[i];
                    v[i] = w;
                }
            }
        }
    }
}

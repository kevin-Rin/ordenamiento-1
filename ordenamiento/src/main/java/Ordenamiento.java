
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
         burbuja(arr);
        System.out.println(java.util.Arrays.toString(arr));
        
    }
    private static void burbuja(int v[]) {
        int n = v.length;
        
        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n -1 -i; j++) {
                if (v[j] > v[j+1]) {
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }
    }
}

package Ordenação;

public class ShellSort {
    public static void shellSort(int[] array) {
        int n = array.length;

        
        for (int h = n / 2; h > 0; h /= 2) {
            
            for (int i = h; i < n; i++) {
                int temp = array[i];
                int j;

                
                for (j = i; j >= h && array[j - h] > temp; j -= h) {
                    array[j] = array[j - h];
                }

                
                array[j] = temp;
            }
        }
    }
}

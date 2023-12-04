package Ordenação;

public class MergeSort {
    public static void mergeSort(int[] array) {
        int n = array.length;

        if (n > 1) {
            int meio = n / 2;

            
            int[] left = new int[meio];
            int[] right = new int[n - meio];

            System.arraycopy(array, 0, left, 0, meio);
            System.arraycopy(array, meio, right, 0, n - meio);

            
            mergeSort(left);
            mergeSort(right);

            
            merge(array, left, right);
        }
    }

    public static void merge(int[] array, int[] left, int[] right) {
        int n1 = left.length;
        int n2 = right.length;

        int i = 0, j = 0, k = 0;

        
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
    }
}

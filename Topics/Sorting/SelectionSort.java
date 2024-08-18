package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {23,34,55,65,45,67,12,13};
        System.out.println(Arrays.toString(selectionSort(nums)) );
    }

    public static  int[]  selectionSort(int[] ar){
        int n = ar.length;
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (ar[min]>ar[j]){
                    min = j;
                }
            }
            int temp = ar[i];
            ar[i] = ar[min];
            ar[min] = temp;
        }
        return ar;
    }
}

package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {23,34,55,65,45,67,12,13};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static void insertionSort(int[] ar){
        for (int i = 0; i < ar.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (ar[j]>ar[j-1]){
                    int temp = ar[j];
                    ar[j] = ar[j-1];
                    ar[j-1] = temp;
                }
            }
        }
    }
}

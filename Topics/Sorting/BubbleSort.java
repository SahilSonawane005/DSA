package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {23,45,1,21,32,12,56,87};

        System.out.println(Arrays.toString(bubbleSort(nums)));
    }
    public static int[] bubbleSort(int[] ar){
        for (int i = 0; i < ar.length; i++) {
            for (int j = 1; j <ar.length-i ; j++) {
                if (ar[j]<ar[j-1]){
                    int temp = ar[j];
                    ar[j] = ar[j-1];
                    ar[j-1] = temp;
                }
            }

        }
        return ar;
    }
}

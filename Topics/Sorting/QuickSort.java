package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] nums ={12,34,11,45,65,87,89};
        sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));

    }

    public static void sort(int[] ar, int low , int high){
        if(low>=high){
            return;
        }
        int start = low ;
        int end = high;
        int mid = start + (end-start)/2;
        int pivot = ar[mid];

        while (start<=end) {

            while (ar[start] < pivot) {
                start++;
            }
            while (ar[end] > pivot) {
                end--;
            }
            if (start <= end) {
                int temp = ar[start];
                ar[start] = ar[end];
                ar[end] = temp;
                start++;
                end--;
            }
        }

        sort(ar,low,end);
        sort(ar,start,high);
    }
}

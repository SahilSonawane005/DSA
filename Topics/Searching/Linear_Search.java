package Searching;

import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        int[] nums ={2,3,5,78,1,22,34,65,90};

        System.out.println(linearSearchAlgo(3,nums));
        System.out.println(linearSearchAlgo(90,nums));
        System.out.println(linearSearchAlgo(22,nums));
        System.out.println(linearSearchAlgo(81,nums));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want to search : ");
        int n = sc.nextInt();
        System.out.println(linearSearchAlgo(n,nums));
    }
    public static  int linearSearchAlgo(int key,int[] ar){
//        TIME COMPLEXTIY: O(n)

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == key){
                return i; // returns index of element
            }
        }
        return -1; //element not found
    }
}

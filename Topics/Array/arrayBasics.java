package Array;

import java.lang.reflect.Array;

public class arrayBasics {
    public static void main(String[] args) {
        //Array is data struture used to store items of similar data types
        //Array indexing start with 0 to n-1;

        int[] num1 =new int[10]; //intialiazation of num array of size 10;

        int[] num2 = {4,45,78,64,232,787,12}; //Declaring elements of array  

        //Array can be of different data types also such as String, boolean,Float,Double

        String[] name = {"sai","sunil","rahul"}; //String Array
        Boolean[] ar = {true,false,false,true};  //Boolean Array

        //to acccess elements of array use index of elements
        System.out.println(num2[2]);

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

        for (Boolean boolean1 : ar) {
            System.out.println(boolean1);
        }

        int[] marks = {78,54,65,89,15,41,23,68};
        int[] cloneMarks = marks.clone();
        for (int i = 0; i < cloneMarks.length; i++) {
            System.out.print(cloneMarks[i]+" ");
        }
        System.out.println();
        //reverse array ****INTERVIEW QUESTION****
        

        int left = 0;
        int right = marks.length-1;

        while (left<=right) {
            int temp = marks[left];
            marks[left] = marks[right];
            marks[right] = temp;
            left++;
            right--;
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
      
     }
}

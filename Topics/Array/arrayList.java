package Array;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        //Arraylist can store any type of data in single list
        //to add elements
        list.add(45);
        list.add("abc");
        list.add(7.2f);
        list.add(true);
        list.add(332.4D);

        System.out.println(list.size()); //returns size

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ " ");
        }
        System.out.println(list.contains(45));

        System.out.println(list.indexOf(true));

        System.out.println(list.reversed());

        System.out.println(list.removeLast());
        
    }
}

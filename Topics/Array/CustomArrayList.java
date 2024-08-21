package Array;

public class CustomArrayList {
    public static void main(String[] args) {
        ListMethods list = new ListMethods();
        list.add(0);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(12);
        list.add(14);
        list.add(16);


        System.out.println("List Items: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
        System.out.println("List Size: "+list.size());

        System.out.println("Index of 8: " +list.indexOf(8));

        list.add(18);
        list.add(20);
        System.out.println("List Size: "+list.size());
        System.out.println(list.isEmpty());

//        ListMethods l2 = new ListMethods();
//        System.out.println(l2.isEmpty());
//        System.out.println(l2.size());
    }
}

class ListMethods{
    static int defaultCapacity = 10;
    int[] data ; //initial array
    int size = 0; //initial size

    public ListMethods() {
        data = new int[defaultCapacity];
    }
    public int size(){
        return size;
    }

    public boolean isFull(){
        return size == data.length;
    }
    public void resize(){
        int[] temp = new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }
    public int get(int index){
        return data[index];
    }
    public int indexOf(int num){
        for (int i = 0; i < size(); i++) {
            if (num == this.get(i)){
                return i;
            }
        }
        return -1;
    }
    public boolean isEmpty(){
        if (this.size() ==0){
            return true;
        }
        return false;
    }
}

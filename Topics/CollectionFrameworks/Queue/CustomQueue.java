package CollectionFrameworks.Queue;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;
    public CustomQueue()
    {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
        this.data = new int[size];
    }
    public boolean isEmpty(){
        return end == 0;
    }
    public int length(){
        return end;
    }
    public boolean isFull(){
        return end == data.length-1;
    }
    public void remove(){
        if (isEmpty()){
            System.out.println("Queue is empty");
        }
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
    }
    public void resize(){
        int[] temp = new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    public void insert (int value) throws Exception{
       if (isFull()){
           resize();
       }
       data[end++] = value;
    }
    public int front () throws  Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
    }
    public void display(){
        int i = 0;
        while (i != end){
            System.out.print(data[i]+ " ");
            i++;
        }
    }

    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue();
        for (int i = 1; i <= 15; i++) {
            queue.insert(i);
        }
        queue.display();
        System.out.println();
        System.out.println(queue.front());
        System.out.println(queue.length());
        queue.remove();
        queue.display();
//        System.out.println(queue.front());
        System.out.println(queue.length());
    }
}

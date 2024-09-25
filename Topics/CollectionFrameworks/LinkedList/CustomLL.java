package CollectionFrameworks.LinkedList;

public class CustomLL {

    public static void main(String[] args) {
        System.out.println("Implementation of CUSTOM LINKED LIST");
        CustomLL list = new CustomLL();

        list.insertFirstIndex(2);
        list.insertFirstIndex(4);
        list.insertFirstIndex(6);
        list.insertFirstIndex(8);
        list.insertFirstIndex(10);

        list.display();
    }
    private Node head; //Head node: first element of LL.
    private Node tail; //Tail node: Last element of LL.
    private int size;

    public CustomLL() {
        this.size =0;
    }

    public void insertFirstIndex(int value){
        Node n1 = new Node(value); //Creation of new node.
        n1.next = head;
        //when inserting first item head is null.
        //when inserting multiple items head is previously inserted item.

        head = n1;
        //make newly inserted item as head.
        if (tail ==null){
            tail = head;
        }
        size+=1;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(STR."\{temp.value}->");
            temp = temp.next;
        }
        System.out.println("End");
    }

}
class Node{
    //Linked List provide non-contiguous memory allocation
    //Every value in LL is called as node.
    //Node contains 2 properties [i] value of node. [ii] address of next node.
    //Each LL contains &Head & Tail.
    //When LL is empty Head & Tail are also empty
    //When head == tail it means LL contains only 1 item.
    protected int value;
    protected Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node(int value) {
        this.value = value;
    }
}
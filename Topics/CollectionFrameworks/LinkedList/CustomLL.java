package CollectionFrameworks.LinkedList;

public class CustomLL {
    public static void main(String[] args) {
        System.out.println("***** Implementation of CUSTOM LINKED LIST *****");
        System.out.println();

        CustomLL list = new CustomLL();
        System.out.println(STR."Length of LL\{list.size()}");
        System.out.println();

        list.insertFirstIndex(1);
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtLast(4);
        list.insertAtLast(5);
        list.insertAtLast(6);
        list.insertAtIndex(50,3);
        list.display();
        System.out.println(STR."Length of LL: \{list.size()}");
        System.out.println();

        list.deleteFirst();
        list.display();
        System.out.println(STR."Length of LL: \{list.size()}");
        System.out.println();

        list.deleteLast();
        list.display();
        System.out.println(STR."Length of LL: \{list.size()}");
        System.out.println();

        list.deleteAtIndex(2);
        list.display();
        System.out.println(STR."Length of LL: \{list.size()}");
        System.out.println();

        list.searchElement(3);
        list.searchElement(33);
//        System.out.println(list.head.value);

    }
    private Node head; //Head node: first element of LL.
    private Node tail; //Tail node: Last element of LL.
    private int size;

    public CustomLL() {
        this.size =0;
    }

    public void insertAtIndex(int value, int index){
        if (index == 0){
            insertFirstIndex(value);
            return;
        }
        if (index==size){
            insertAtLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node n = new Node(value,temp.next);
        temp.next = n;
        size++;
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
    public void insertAtLast(int value){
        if (tail==null){
            insertFirstIndex(value);
        }
        else {
        Node n = new Node(value);
        tail.next = n;
        tail = n;
        size+=1;
        }
    }
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(STR."\{temp.value}->");
            temp = temp.next;
        }
        System.out.println("End");
    }
    public int size(){
//        return size;
        int length =0;
        Node temp = head;
        while (temp!=null){
            length++;
            temp = temp.next;
        }
        return length;
    }
    public void searchElement(int value){
        Node temp = head;
        while (temp!=null){
            if (temp.value==value) {
                System.out.println(STR."\{value} is present in Linked List");
                return;
            }
            temp = temp.next;
        }
        System.out.println(STR."\{value} is not present in Linked List");
    }
    public void deleteFirst(){
        Node temp = head;
        head = temp.next;
        if(head == null){
            tail = null;
        }
        size--;
    }
    public void deleteLast(){
        Node temp = head;
        for (int i = 1; i < size-1; i++) {
            temp = temp.next;
        }
        tail = temp;
        temp.next =null;
        size--;

    }
    public void deleteAtIndex(int index){
        if (index==0)deleteFirst();
        if(index==size-1)deleteLast();

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
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
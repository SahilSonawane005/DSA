package CollectionFrameworks.LinkedList;

public class DoublyLinkedList {
    DoubleNode head;
    DoubleNode tail;
    int size;
    public DoublyLinkedList() {
        this.size = 0;
    }
    public void insertAtFirst(int value){
        DoubleNode node = new DoubleNode(value);
        node.next = head;
        node.prev = null;
        if (head!= null){
            head.prev = node;
        }
        head = node;
        size++;
    }
    public void insertAtLast(int value){
        if (head==null)insertAtFirst(value);
        DoubleNode temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        DoubleNode node = new DoubleNode(value);
        temp.next = node;
        node.prev = temp;
        node.next = null;
        tail = node;
        size++;
    }
    public void insertAtIndex(int index, int value){
        if (index == 0){insertAtFirst(value) ;return;};
        if (index == size){ insertAtLast(value);return;}

        DoubleNode temp  =head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        DoubleNode node = new DoubleNode(value);
        node.next = temp.next;
        node.prev = temp;
        temp.next = node;
        node.next.prev = node;

    }
    public void display(){
        DoubleNode temp = head;
        while (temp != null){
            System.out.print(STR."\{temp.value} -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }
    public void displayRev(){
        DoubleNode temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        while (temp != null){
            System.out.print(STR."\{temp.value} -> ");
            temp = temp.prev;
        }
        System.out.println("Start");


    }

    public int length(){
        DoubleNode node = head;
        int temp = 0;
        while (node!=null){
            temp++;
            node = node.next;
        }
        return temp;
    }
    public void deleteFirst(){
        if (head == null){
            System.out.println("list is empty");
        }
        DoubleNode temp  =  head;
        head = temp.next;
        head.prev = null;
        size--;
    }
    public void deleteLast(){
        DoubleNode temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.prev.next = null;
        tail = temp;
        size--;

    }
    public void deleteAtIndex(int index){
        if (index==0){
            deleteFirst();
            return;
        }
        if (index==size-1){
            deleteLast();
        }
        DoubleNode temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;

    }
    public int getIndex(int value){
        int temp = 0;
        DoubleNode temp_node = head;
        while(temp_node.value != value)
        {
            temp_node = temp_node.next;
            temp++;
        }
        return temp;
    }
    DoubleNode search(int value){
        DoubleNode node = head;
        while (node != null){
          if (node.value == value){
              return node;
          }
          node = node.next;
        }
        return  null;
    }

//    public int checkPrev(int index){
//
//        DoubleNode temp = head;
//        if (index == 0) {
//            throw new IllegalArgumentException("No previous node exists at index 0 (head of the list).");
//        }
//        if (index >= size) {
//            throw new IllegalArgumentException("Index out of bounds.");
//        }
//        for (int i = 0; i < index; i++) {
//            temp = temp.next;
//        }
//
//        if (temp.prev != null) {
//            return temp.prev.value;  // Return the value of the previous node
//        }
//        else {
//            // Handle case where there's no previous node (e.g., head node)
//            throw new IllegalArgumentException("No previous node exists at the given index.");
//        }
//    }

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtFirst(5);
        list.insertAtFirst(4);
        list.insertAtFirst(3);
        list.insertAtFirst(2);
        list.insertAtFirst(1);
        list.insertAtLast(6);
        list.insertAtIndex(3,55);
        list.insertAtIndex(5,555);

        list.display();
        list.displayRev();
        System.out.println("Length of Doubly Linked List is : "+list.length());
        System.out.println();

        list.deleteFirst();
        list.display();
        System.out.println("Length of Doubly Linked List is : "+list.length());
        System.out.println();

        list.deleteLast();
        list.display();
        System.out.println("Length of Doubly Linked List is : "+list.length());
        System.out.println();

        list.deleteAtIndex(2);
        list.display();
        System.out.println("Length of Doubly Linked List is : "+list.length());
        System.out.println();

//        System.out.println(list.getIndex(555));

        System.out.println(list.search(555));
        System.out.println(list.search(4));

    }
}

class DoubleNode  {
    int value;
    DoubleNode next;
    DoubleNode prev;

    public DoubleNode(int value) {
        this.value = value;
    }

    public DoubleNode(int value, DoubleNode next, DoubleNode prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}

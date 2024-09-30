package CollectionFrameworks.LinkedList;

public class CircularLL {
    class Node{
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }
    public CircularLL(int size) {
        this.size = size;
    }
    private  Node head;
    private Node tail;
    int size = 0;

    public CircularLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert (int value){
        Node node = new Node(value);
        if (head == null){
            head = node;
            tail = node;
            size++;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void delete(int value){
        Node node = head;
      if (node == null){
          return;
      }
      if (node.value == value){
          head = head.next;
          tail.next = head;
          return;
      }
      do {
          Node n = node.next;
          if (n.value == value){
              node.next = n.next;
              break;
          }
          node = node.next;
      }
      while (node!= head);
    }
    public void display(){
        Node temp = head;
        if (head!= null){
            do {
                System.out.print(temp.value + " - > ");
                temp = temp.next;
            }while (temp!= head);
        }
        System.out.println("HEAD");
    }


    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);

        list.display();
        list.delete(5);
        list.display();
    }
}


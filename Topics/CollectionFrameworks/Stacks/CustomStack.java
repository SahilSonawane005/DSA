package CollectionFrameworks.Stacks;

public class CustomStack {
    protected int[] data ;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }
    public boolean isEmpty(){
        return ptr == -1;
    }
    public boolean isFull(){
        return ptr == data.length-1;
    }

    public boolean push (int item)  {
        if(isFull()){
//            throw new Exception("Cannot push in full stack");
            reaize();
            ptr++;
            data[ptr] = item;
            return true;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()){
            throw new Exception("Cannot pop from Empty stack");
        }
        return data[ptr--];
    }
    public  int peek() throws Exception {
        if (isEmpty()){
        throw new Exception("Cannot pop from Empty stack");
    }
        return data[ptr];
    }
    public int len(){
        return data.length;
    }

    public void reaize(){
        if (isFull()){
            int [] temp = new int[data.length*2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
    }

    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack();
        System.out.println("length of stack "+stack.len());
//       stack.push(2);
//       stack.push(3);
//       stack.push(4);
//       stack.push(5);
//
//       System.out.println(stack.pop());
//       System.out.println(stack.pop());
//       System.out.println(stack.pop());
//       System.out.println(stack.pop());

        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        for (int i = 20; i > 0; i--) {
            stack.push(i);
        }
        for (int i = 1; i <= 20; i++) {
            System.out.print(stack.pop()+" ");
        }
        System.out.println();

        System.out.println("length of stack "+stack.len());

        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());

    }
}

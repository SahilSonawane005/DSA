package OOP.Generics;

public class GenericDemo {
    public static void main(String[] args) {
        myGen<Integer> g1 = new myGen<>(34);
        myGen<Float> g2 = new myGen<>(23.4f);
        myGen<String> g3 = new myGen<>("Hello World");

        System.out.println(g1.getT());
        System.out.println(g2.getT());
        System.out.println(g3.getT());

    }
}

//The Java Generics programming is introduced in J2SE 5 to deal with type-safe objects.
//It makes the code stable by detecting the bugs at compile time.

//Before generics, we can store any type of objects in the collection, i.e., non-generic.
//Now  generics force the java programmer to store a specific type of objects.
class myGen<T>{
    private T t;

    public myGen(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
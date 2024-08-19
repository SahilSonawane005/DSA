package OOP.PILLERS;

public abstract class Abstraction {
    abstract void display();

    public Abstraction() {
    }

    //Static method in abstract class
     static void hello(){
        System.out.println("hello World");
    }

    public static void main(String[] args) {
        child c1 = new child();
        c1.display();
    }
}

//Abstraction is a process of hiding the implementation details and showing only functionality to the user.

//There are two ways to achieve abstraction in java
//1) Abstract class (0 to 100%)
//2) Interface (100%)

//1) Abstract Classes: a class which declared using abstract keyword are known as abstract classes

//If any method in class is abstract then we have to make abstract class
//abstract class method must be overridden in child classes

class child extends Abstraction{
    @Override
    void display(){
        System.out.println("overridden class");
    }
}


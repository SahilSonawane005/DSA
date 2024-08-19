package OOP.PILLERS;

public class Polymorphism {
    public static void main(String[] args) {
        demo d = new demo();

        d.add(3,4);
        d.add(3,4,6);
        d.add("hello ","world");

        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.display();
        dog.display();

        Animal a = new Dog();
        a.display();

    }
}

//Polymorphism means behaving in many forms
//Types of polymorphism: 1) Compile TIme 2) Run Time
//We can achieve Compile TIme polymorphism by overloading & Run Time polymorphism by overriding

//overloading: Function with same name but different parameter
//There are two ways to overload the method in java
// 1) By changing number of arguments
// 2) By changing the data type

class demo{
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(int a, int b,int c){

        System.out.println(a+b+c);
    }
    void add(String s1, String s2){
        System.out.println(s1+s2);
    }
}

//OVERRIDING: Function with same name & same parameter

class Animal{
    void display(){
        System.out.println("I am animal");
    }
}
class Dog extends Animal{
    @Override
    void display(){
        System.out.println("I am animal,dog");
    }
}

//a static method cannot be overridden.
//It is because the static method is bound with class whereas instance method is bound with an object. Static belongs to the class area, and an instance belongs to the heap area.

//Can we override java main method?
//No, because the main is a static method.
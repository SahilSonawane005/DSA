package OOP.PILLERS;

public class Inheritance {
    public static void main(String[] args) {
        Child child = new Child();
        Child2 child2 = new Child2();
        Child3 child3 = new Child3();

//        Parent p1 = new Parent(5.5f,"black","white");
//        System.out.println(p1);


    }
}
//The extends keyword indicates that you are making a new class that derives from an existing class. The meaning of "extends" is to increase the functionality.
class Parent{
    float height;
    String haircolor;
    String skintone;

    @Override
    public String toString() {
        return STR."Parent{height=\{height}, haircolor='\{haircolor}\{'\''}, skintone='\{skintone}\{'\''}\{'}'}";
    }

    public Parent(float height, String haircolor, String skintone) {
        this.height = height;
        this.haircolor = haircolor;
        this.skintone = skintone;
    }

    public Parent() {
        System.out.println("Parent constructor");
    }
}

//SINGLE INHERITANCE
class Child extends Parent{
    public Child() {
        System.out.println("Child1 constructor");
    }
    public Child(float height, String haircolor, String skintone) {
        super(height, haircolor, skintone);
    }
}

//MULTIPLE INHERITANCE
//one class inherits properties in subclass and another subclass inherits the property from that    subclass
class Child2 extends Child{
    Child2(){
        System.out.println("Child 2 constructor");
    }

    public Child2(float height, String haircolor, String skintone) {
        super(height, haircolor, skintone);
    }
}

//HIERARCHICAL INHERITANCE
//one class inherits its properties in more than one class. here parent class inherits properties in  child1 & child3
class Child3 extends Parent{
    Child3(){
        System.out.println("Child3 constructor");
    }
}


//HYBRID INHERITANCE
//combination of two or more types of inheritance
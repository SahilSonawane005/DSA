package OOP;
// THIS FILE INCLUDES BASICS OF OOP SUCH AS CLASSES, OBJECTS,CONSTRUCTOR,KEYWORDS
public class BasicExample {
    public static void main(String[] args) {

//The new keyword is used to allocate memory at runtime. All objects get memory in Heap memory area.

        Car car1 = new Car(20000,"farari",15f,"Petrol");
        System.out.println(car1);

        Car car2 = new Car(50000,"maruti",10f,"diesel");
        System.out.println(car2);

        Car car3 = new Car();
        System.out.println(car3);

        Shape shape = new Shape();
        System.out.println(shape.area(3));
        System.out.println(shape.area(3,4));
        System.out.println(shape.area(5));

        // shape.pie = 2f; CANNOT REASSIGN VALUE OF FINAL KEYWORD

    }
}

class Car{
    int price;
    String model;
    float carLife;
    String engineType;


//In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling constructor, memory for the object is allocated in the memory.
//It is a special type of method which is used to initialize the object.
//Every time an object is created using the new() keyword, at least one constructor is called.
//It calls a default constructor if there is no constructor available in the class. In such case, Java compiler provides a default constructor by default.
    public Car() {
        System.out.println("Default constructor");
    }
    public Car(int price, String model, float cqarLife, String engineType) {
        this.price = price;
        this.model = model;
        this.carLife = cqarLife;
        this.engineType = engineType;
        System.out.println("Parameterized constructor");

    }

    //CONSTRUCTOR OVERLOADING
    public Car(int price, String model) {
        this.price = price;
        this.model = model;
    }

    @Override

    //HERE WE ARE USING TO STRING METHOD BECAUSE IF WE DIRECTLY PRINT THE VALUE WITHOUT TO STRING IT WILL GENERATE RANDOM HASH CODE VALUE.
    public String toString() {
        return STR."car{price=\{price}, model='\{model}\{'\''}, cqarLife=\{carLife}, engineType='\{engineType}\{'\''}\{'}'}";
    }
}

class Shape{

    final float pie = 3.14f; //FINAL KEYWORD
    public double area(double r){
        System.out.println("circle area: ");
        return pie * r*r;
    }


    public int area(int l,int b){
        System.out.println("rectangle area: ");
        return l * b;
    }
    public int area(int side){
        System.out.println("square area: ");
        return side*side;
    }

}


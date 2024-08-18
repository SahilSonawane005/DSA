package OOP;
// THIS FILE INCLUDES BASICS OF OOP SUCH AS CLASSES, OBJECTS,CONSTRUCTOR,KEYWORDS
public class BasicExample {
    public static void main(String[] args) {
        Car car1 = new Car(20000,"farari",15f,"Petrol");

        //The new keyword is used to allocate memory at runtime. All objects get memory in Heap memory area.

        System.out.println(car1);

        Car car2 = new Car(50000,"maruti",10f,"diesel");
        System.out.println(car2);

        Car car3 = new Car();
        System.out.println(car3);




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

    @Override
    public String toString() {
        return "car{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", cqarLife=" + carLife +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}


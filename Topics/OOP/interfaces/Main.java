package OOP.interfaces;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,5);
        System.out.println(rectangle.getArea());

        Circle circle = new Circle(7);
        System.out.println(circle.getArea());

        Triangle triangle = new Triangle(4,3);
        System.out.println( triangle.getArea());

    }

//INTERFACES:
//To remove ambiguity in multiple inheritance we use Interfaces
//It is like an abstract class where variables are static & final by default
//You cannot create objects of interfaces
//To implement interfaces we use "implement" keyword
//Members are public by default
//Class can implement more than one interfaces
    static class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return radius * radius * 3.14;
        }
    }

    static class Rectangle implements Shape{
        private double length;
        private double width;
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }
        @Override
        public double getArea() {
            return length*width;
        }
    }

    static class Triangle implements Shape {
        double base;
        double height;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        public double getArea() {
            return base * height * 0.5;
        }
    }
}





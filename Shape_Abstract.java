
/**
 * The Shape class is an abstract class that holds general data about a shape.
 * Super class!!
 */
abstract class Shape {

    // Instance variables
    int side;
    double area;
    double perimeter;

    // abstract methods
    // It must be overridden in a subclass.
    abstract void calculateArea();

    abstract void calculatePerimeter();

    // concrete method
    public void display() {
        System.out.println("The area is " + area + " & perimeter is " + perimeter);
    }

}

/**
 * This class Triangle is extended from shape abstaract class.
 */
class Triangle extends Shape {

    // Instance variables
    // side variable from the Shape abstract class holds the base lenght of the
    // triangle
    int height;

    // Parameterized Constructor
    public Triangle(int side, int height) {
        this.side = side;
        this.height = height;
    }

    // Overiding the abstract calculateArea method from Shape abstract class
    @Override
    void calculateArea() {

        area = 0.5 * side * height;
    }

    // Overiding the abstract calculatePerimeter method from Shape abstract class
    @Override
    void calculatePerimeter() {

        perimeter = side + height + (Math.pow(Math.pow(side, 2) + Math.pow(height, 2), 0.5));
    }

    // Overiding the abstract display method from Shape abstract class
    @Override
    public void display() {

        System.out.println("The Tringle with base " + side + "cm and height " + height + "cm has area about " + area
                + "sq.cm and peimeter of " + perimeter + "cm");
    }

}

/**
 * This class Rectangle is extended from shape abstaract class
 */
class Rectangle extends Shape {

    // Instance variables
    // side variable from the Shape abstract class holds the lenght of the rectangle
    int breadth;

    // Parameterized Constructor
    public Rectangle(int side, int breadth) {
        this.side = side;
        this.breadth = breadth;
    }

    // Overiding the abstract calculateArea method from Shape abstract class
    @Override
    void calculateArea() {

        area = side * breadth;
    }

    // Overiding the abstract calculatePerimeter method from Shape abstract class
    @Override
    void calculatePerimeter() {

        perimeter = 2 * (side + breadth);
    }

    // Overiding the abstract display method from Shape abstract class
    @Override
    public void display() {

        System.out.println("The rectangle with length " + side + "cm and breadth " + breadth + "cm has area about "
                + area + "sq.cm and peimeter of " + perimeter + "cm");
    }

}

/**
 * This class Circle is extended from shape abstaract class.
 */
class Circle extends Shape {

    // side variable from the Shape abstract class holds the radius of the circle

    // Parameterized Constructor
    public Circle(int side) {
        this.side = side;
    }

    // Overiding the abstract calculateArea method from Shape abstract class
    @Override
    void calculateArea() {

        area = 3.1415 * side * side;
    }

    // Overiding the abstract calculatePerimeter method from Shape abstract class
    @Override
    void calculatePerimeter() {

        perimeter = 2 + 3.1415 * side;
    }

    // Overiding the abstract display method from Shape abstract class
    @Override
    public void display() {

        System.out.println("The circle with radius of " + side + "cm has area about " + area + "sq.cm and peimeter of "
                + perimeter + "cm");
    }

}

/**
 * This class Cube is extended from shape abstaract class.
 */
class Cube extends Shape {

    // side variable from the Shape abstract class holds the side length of the cube

    // Parameterized Constructor
    public Cube(int side) {
        this.side = side;
    }

    // Overiding the abstract calculateArea method from Shape abstract class
    @Override
    void calculateArea() {

        area = 6 * (side * side);
    }

    // Overiding the abstract calculatePerimeter method from Shape abstract class
    @Override
    void calculatePerimeter() {

        perimeter = 12 * side;
    }

    // Overiding the abstract display method from Shape abstract class
    @Override
    public void display() {

        System.out.println("The cube with side lenght of " + side + "cm has area about " + area
                + "sq.cm and peimeter of " + perimeter + "cm");
    }

}

/**
 * This class Squere is extended from shape abstaract class.
 */
class Square extends Shape {

    // side variable from the Shape abstract class holds the side length of the
    // square

    // Parameterized Constructor
    public Square(int side) {
        this.side = side;
    }

    // Overiding the abstract calculateArea method from Shape abstract class
    @Override
    void calculateArea() {

        area = side * side;
    }

    // Overiding the abstract calculatePerimeter method from Shape abstract class
    @Override
    void calculatePerimeter() {

        perimeter = 4 * side;
    }

    // Overiding the abstract display method from Shape abstract class
    @Override
    public void display() {

        System.out.println("The square with side lenght of " + side + "cm has area about " + area
                + "sq.cm and peimeter of " + perimeter + "cm");
    }

}

public class Shape_Abstract {

    public static void main(String[] args) {

        // Creating objects or instances
        // Creating a reference variable of Shape which will hold the objects of all the
        // subclasses.
        // Down casting!
        Shape triangle = new Triangle(15, 20);
        Shape rectangle = new Rectangle(20, 30);
        Shape circle = new Circle(30);
        Shape cube = new Cube(40);
        Shape square = new Square(45);

        System.out.println("\nShapes and there respective area and perimeter\n");

        // Calculating area and perimeter of triangle and displaying
        triangle.calculateArea();
        triangle.calculatePerimeter();
        triangle.display();

        // Calculating area and perimeter of rectangle and displaying
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        rectangle.display();

        // Calculating area and perimeter of circle and displaying
        circle.calculateArea();
        circle.calculatePerimeter();
        circle.display();

        // Calculating area and perimeter of cube and displaying
        cube.calculateArea();
        cube.calculatePerimeter();
        cube.display();

        // Calculating area and perimeter of square and displaying
        square.calculateArea();
        square.calculatePerimeter();
        square.display();
    }

}
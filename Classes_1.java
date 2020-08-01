
public class Classes_1 {
    public static void main(String[] args) {

        //Creating an object or instance  
        rectangle r1 = new rectangle();
        //Initializing objects  
        r1.setLength(25);
        r1.setBreadth(35);

        System.err.println("Length is " + r1.getLength());
        System.err.println("Breadth is " + r1.getBreadth());
        System.out.println("Area of Rectangle is " + r1.getArea());
        System.out.println("Perimeter of Rectangle is " + r1.getPerimeter());

    }
}

// Class Declaration 
class rectangle {
    // Instance Variables 
    private float length;
    private float breadth;

    // Getters And Setters
    public float getLength() {
        return this.length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getBreadth() {
        return this.breadth;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }

    public float getArea() {
        return (length * breadth);
    }

    public float getPerimeter() {
        return (2 * breadth * length);
    }

}
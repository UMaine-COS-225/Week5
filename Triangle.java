class Triangle extends Shape implements Drawable {

    // This class extends from Shape class and therefore has all the attributes and
    // methods from Shape

    // It also implements the Drawable Interface and therefore all the methods in
    // the Drawable interface must also be implemented here.

    // We define additional attributes of this class.
    int base, height;

    // Default constructor
    public Triangle() {
        super();
        this.base = 15;
        this.height = 10;
    }

    // Since getArea is an abstract method in Shape.java, I must define this method
    // in here. If I do not, I get errors!
    public double getArea() {
        return 0.5 * base * height;
    }

    // Similarly, printDimensions is also an abstract method in Shape.java.
    // If I do not define this, I will get errors.
    // EXERCISE: Implement a method to print dimensions
    public void printDimensions() {
        System.out.println("In Triangle class"); // For you to implement
    }

    // Since this class implements the Drawable interface, it needs to
    // implement all of its methods.
    public void drawShape() {
        System.out.println("Implementing something");

    }

}
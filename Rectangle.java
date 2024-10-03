class Rectangle extends Shape implements Drawable, Expandable {
    // This class extends from Shape class and therefore has all the attributes and
    // methods from Shape

    // It also implements the Drawable Interface and therefore all the methods in
    // the Drawable interface must also be implemented here.

    // We define additional attributes of this class.
    // By having the protected keyword, we can use these attributes in this and the
    // sub-classes
    protected int width, height;

    // Default constructor
    public Rectangle() {
        super(); // This goes into Shape's default constructor
        width = 10;
        height = 25;
    }

    public Rectangle(String name, String color) {
        // We re-use the code from Shape's constructor that accepts name and color
        super(name, color);
        width = 10;
        height = 20;
    }

    public Rectangle(int width, int height) {
        this(); // We are calling the default constructor of Rectangle class

        // The keyword `this` helps us understand the difference between attributes
        // of this class and the parameters of the constructor.
        // In this constructor, we have the names `width` and `height`
        // as parameters and they are the same name as the attributes of this class
        // which defined above. To ensure we instantiate the attributes width and height
        // we use the `this` word to specify.

        this.width = width;

        this.height = height;
    }

    public Rectangle(String name, String color, int width, int height) {
        // EXERCISE: Implement this parameterized constructor that accepts name, color,
        // width, and height
    }

    // // Since getArea is an abstract method in Shape.java, I must define this
    // method
    // // in here. If I do not, I get errors!
    // public double getArea() {
    // return this.width * this.height;
    // }

    // Similarly, printDimensions is also an abstract method in Shape.java.
    // If I do not define this, I will get errors.
    // EXERCISE: Implement a method to print dimensions
    public void printDimensions() {
        System.out.println("");
    }

    // Since this class implements the Drawable interface, it needs to implement all
    // of its methods.
    public void drawShape() {
        System.out.println("The shape is a rectangle with some width and height");
    }

    @Override
    public void increaseSize() {
        System.out.println("Increasing size");
    }

    @Override
    public void expandShape() {
        System.out.println("Expanding shape");
    }

}
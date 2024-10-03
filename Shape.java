abstract class Shape {

    protected String name, color;

    // Parameterized constructor: Something to create instances of Shape
    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // Default constructor
    public Shape() {
        name = "Bruce";
        color = "Pink";
    }

    // Simple method to print name and color which will be inherited by other
    // classes the extend Shape
    public void printNameAndColor() {
        System.out.println("The name of this shape is " + name + " and its color is " + color);
    }

    // Getter methods to get values
    public String getName() {
        return name;
    }

    public String getCollor() {
        return color;
    }

    // EXERCISE: Implement the setter methods
    // public void setColor();
    // public void setName();

    // Abstract method that all inherited classes must implement.
    // public abstract double getArea();

    // // Another abstract method that all inherited classes must implement.
    // public abstract void printDimensions();

}
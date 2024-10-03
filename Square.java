class Square extends Rectangle {
    // Since we extend the Rectangle class, we have all the
    // attributes and methods of Rectangle.

    public Square() {
        // We use the Rectangle's parameterized constructor that takes in
        // width and height.
        super(10, 10);
    }

    // All the abstract methods that a sub-class of Shape must implement
    // is already implemented by Rectangle which is why we do not *need* to
    // implement them. But we should definitely implement them.

    @Override
    public void printDimensions() {
        System.out.println("The side of the square is " + width);
    }
}
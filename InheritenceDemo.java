class InheritenceDemo {

    public static void main(String[] args) {

        Rectangle firsRectangle = new Rectangle();
        firsRectangle.printNameAndColor();

        Rectangle secondRectangle = new Rectangle("Viola", "White");
        secondRectangle.printNameAndColor();

        Square someSquare = new Square();
        someSquare.printDimensions();

        Triangle oneTriangle = new Triangle();
        oneTriangle.printDimensions();

        // printNameAndColor are never defined in Rectangle, Square,
        // or Triangle class files
        // But we have defined this method called printNameAndColor
        // However, because all of these class files extend Shape,
        // they have access to these methods
        firsRectangle.printNameAndColor();
        secondRectangle.printNameAndColor();
        someSquare.printNameAndColor();
        oneTriangle.printNameAndColor();

    }
}
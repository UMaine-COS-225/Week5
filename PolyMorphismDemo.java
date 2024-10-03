import java.util.ArrayList;

class PolyMorphismDemo {

    public static void main(String[] args) {
        // Create an ArrayList called shapeList
        ArrayList<Shape> shapeList = new ArrayList<Shape>();

        // Create Shape objects of different types
        Triangle myTriangle = new Triangle();
        Rectangle firsRectangle = new Rectangle();
        Square newSquare = new Square();

        // Adding Triangle, Rectangle, and Square into a list of Shapes
        // We can do this because Triangle, Rectangle, and Shape is also a Shape
        shapeList.add(myTriangle);
        shapeList.add(firsRectangle);
        shapeList.add(newSquare);

        // We can also iterate over our ArrayList.
        // Note that when we are calling getArea method we
        for (Shape eachShape : shapeList) {
            System.out.println("The area of the shape is : " + eachShape.getArea());
        }
        Vehicle somVehicle = new Vehicle();

        ArrayList<Object> myObjectList = new ArrayList<Object>();

        myObjectList.add(somVehicle);
        myObjectList.add(myTriangle);
        myObjectList.add(firsRectangle);
        myObjectList.add(newSquare);

        ArrayList<Drawable> shapesThatCanDraw = new ArrayList<Drawable>();

        for (Drawable eachShape : shapesThatCanDraw) {
            eachShape.drawShape();
        }

    }
}
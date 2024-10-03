public interface Drawable {

    void drawShape();

    // You cannot have methods with bodies in an abstract class
    // public void drawWithBlueColor(){
    // System.out.println("Drawging the shape with blue color");
    // }

    void increaseSize();
}
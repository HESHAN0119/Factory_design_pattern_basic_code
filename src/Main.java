public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1= shapeFactory.getShape("Circle");
        shape1.draw("Circle");

        Shape shape2= shapeFactory.getShape("Rectangle");
        shape2.draw("Rectangle");
    }
}
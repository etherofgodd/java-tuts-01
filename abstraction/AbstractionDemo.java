package abstraction;

public class AbstractionDemo {

    public static void main(String[] args) {
        GraphicObject circle = new Circle();
        circle.draw();
        circle.resize();
        System.out.println("\n");
        System.out.println("\n");
        GraphicObject rectangle = new Rectangle();
        rectangle.draw();
        rectangle.resize();

    }
}

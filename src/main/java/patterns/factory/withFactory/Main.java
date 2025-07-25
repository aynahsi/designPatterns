package patterns.factory.withFactory;

public class Main {

    public static void main(String[] args) {

        Shape square = ShapeFactory.getShape("square");
        square.draw();

    }
}

//decoupled the instantiation logic with the buisness logic

package patterns.factory.withFactory;

public class Main {

    public static void main(String[] args) {

        Shape circle = ShapeFactory.getShape("circle");
        circle.draw();

    }
}

//decoupled the instantiation logic with the buisness logic

package patterns.factory.withoutFactory;

public class Main{
    public static void main(String[] args) {
        String userShape = "Rectangle";

        Shape shape = null;
        if(userShape.equals("Rectangle")){
             shape = new Rectangle();
        }else if(userShape.equals("Square")){
             shape = new Square();
        }


        if(shape != null){
            shape.draw();
        }
        
    }

}

//tightly coupled
//No Open/Closed Principle	Adding a new shape requires editing the Main class
//Violates Single Responsibility Main class does creation and usage logic

package patterns.factory.withFactory;

public class ShapeFactory{
    public static Shape getShape(String shapeName){
        if(shapeName.equals("rectangle")){
            return new Rectangle();
            
        }else if(shapeName.equals("square")){
            return new Square();
        }
        return null;
    }
}

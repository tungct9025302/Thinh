import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> copyShapes = new ArrayList<>();
            Square square1 = new Square();
            square1.length = 10;
            square1.color = "Red";
            shapes.add(square1);

            Triangle triangle1 = new Triangle();
            triangle1.height=5;
            triangle1.width=7;
            triangle1.color="Blue";
            shapes.add(triangle1);

            Circle circle1= new Circle();
            circle1.radius=6;
            circle1.color="Brown";
            shapes.add(circle1);

            Rectangle rectangle1=new Rectangle();
            rectangle1.length=5;
            rectangle1.width=8;
            rectangle1.color="Yellow";
            shapes.add(rectangle1);

            cloneAndCompare(shapes,copyShapes);
    }
    public static void cloneAndCompare(List<Shape> shapes, List<Shape> copyShapes){
        for(Shape shape:shapes){
            copyShapes.add(shape.clone());
        }
        for(int i=0;i<shapes.size();i++){
            if(shapes.get(i)!=copyShapes.get(i)){
                System.out.println(i + ": Shapes are different objects (yay!)");
                if(shapes.get(i).equals(copyShapes.get(i))){
                    System.out.println(i + ": And they are identical (yay!)");
                }else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            }
            else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}

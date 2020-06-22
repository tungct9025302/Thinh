import java.util.Objects;

public abstract class Shape {
    public int x;
    public int y;
    public String color;
    public Shape(){

    }
    public Shape(Shape content){
        this.x=content.x;
        this.y=content.y;
        this.color=content.color;
    }
    public abstract  Shape clone();
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape)) return false;
        Shape shape2 = (Shape) object2;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }
}

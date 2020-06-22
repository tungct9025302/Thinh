public class Circle extends Shape {
    public int radius;
    public String color;
    public Circle(){

    }
    public Circle(Circle content){
        this.radius=content.x;
        this.color=content.color;
    }
    @Override
    public Shape clone(){
        return new Circle(this);
    }
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle) || !super.equals(object2)) return false;
        Circle shape2 = (Circle) object2;
        return shape2.radius == radius;
    }
}

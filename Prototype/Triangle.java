public class Triangle extends Shape{
    public int width;
    public int height;
    public String color;
    public Triangle(){

    }
    public Triangle(Triangle content){
        this.width=content.x;
        this.height=content.y;
        this.color=content.color;
    }
    @Override
    public Shape clone(){
        return new Triangle(this);
    }
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle) || !super.equals(object2)) return false;
        Triangle shape2 = (Triangle) object2;
        return shape2.width == width && shape2.height == height;
    }
}

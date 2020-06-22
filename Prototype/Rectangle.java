public class Rectangle extends Shape{
    public int width;
    public int length;
    public String color;
    public Rectangle(){

    }
    public Rectangle(Rectangle content){
        this.width=content.x;
        this.length=content.y;
        this.color=content.color;
    }
    @Override
    public Shape clone(){
        return new Rectangle(this);
    }
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Rectangle) || !super.equals(object2)) return false;
        Rectangle shape2 = (Rectangle) object2;
        return shape2.width == width && shape2.length == length;
    }
}

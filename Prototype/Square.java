public class Square extends Shape {
    public int length;
    public String color;
    public Square(){

    }
    public Square(Square content){
        this.length=content.x;
        this.color=content.color;
    }
    @Override
    public Shape clone(){
        return new Square(this);
    }
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle) || !super.equals(object2)) return false;
        Square shape2 = (Square) object2;
        return shape2.length == length;
    }
}

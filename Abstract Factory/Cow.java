public class Cow extends AbstractForMeat {
    //AbstractForMeat will be polymorphism of Cow and Pig
    private static int next=0;
    private static final String[] list={"This is cow Factory","Beef","Oven","Coal"};
    //Constructor
    public Cow(){
        super(list[next]);
        next=next+1;
    }
    //clone the Cow class
    @Override
    public AbstractForMeat clone(){
        return new Cow();
    }
}

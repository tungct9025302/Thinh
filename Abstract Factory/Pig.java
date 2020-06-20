public class Pig extends AbstractForMeat {
    //AbstractForMeat will be polymorphism of Cow and Pig
    private static int next=0;
    private static final String[] list={"This is Pig Factory","Pig","Oven","Coal"};
    //Constructor
    public Pig(){
        super(list[next]);
        next=next+1;
    }
    //clone the Pig class
    @Override
    public AbstractForMeat clone(){
        return new Pig();
    }
}

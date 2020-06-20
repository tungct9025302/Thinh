public class FirstFactory extends AbstractFactory{
    //constructor
    public  FirstFactory(){
        prototype=new Cow();
    }

    @Override
    public AbstractForMeat getMainMaterial(){
        return new AbstractForMeat("\nCow,");
    }

    @Override
    public AbstractForMeat getStageCooking(){
        return  new AbstractForMeat("Put the Cow meat in the Oven with Coal");
    }
}

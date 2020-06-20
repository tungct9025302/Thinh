public class SecondFactory extends AbstractFactory{
    //constructor
    public  SecondFactory(){
        prototype=new Pig();
    }

    @Override
    public AbstractForMeat getMainMaterial() {
        return new AbstractForMeat("\nPig");
    }

    @Override
    public AbstractForMeat getStageCooking(){
        return  new AbstractForMeat("Put the Pig meat in the Oven with Coal");
    }
}

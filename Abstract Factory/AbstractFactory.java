public abstract class AbstractFactory {

    //linking AbstractForMeat with AbstractFactory through prototype var
    public AbstractForMeat prototype;

    //Clone
    public AbstractForMeat getClone(){
        return prototype.clone();
    }

    //abstract Methods for factories
    public abstract AbstractForMeat getMainMaterial();
    public abstract AbstractForMeat getStageCooking();
}

public class AbstractForMeat implements Cloneable {
    public String str;

    //get product info for this class
    public AbstractForMeat(String str){
        this.str=str;
    }
    //abstract clone
    @Override
    public AbstractForMeat clone() {
        AbstractForMeat clone = null;
        try {
            clone = (AbstractForMeat) super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return clone;
    }

    //return string if necessary
    @Override
    public String toString(){
        return str;
    }

}

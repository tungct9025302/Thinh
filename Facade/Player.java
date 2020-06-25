import java.util.List;

public class Player {
    String name;
    Facade facade;
    Player(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void getBadmintonBooking(){
        System.out.println(name+" has booked this....");
        facade.bookWithBadmintonCourt();
    }
    public void getZumbaBooking() {
        System.out.println(name+" has booked this....");
        facade.bookWithZumba();
    }
    public void setFacade(Facade facade){
        this.facade=facade;
    }
}

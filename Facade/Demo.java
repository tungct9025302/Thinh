import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Facade facade=new Facade();

        Player player =new Player("Thinh");
        player.setFacade(facade);
        player.getBadmintonBooking();

        Player player1 =new Player("QA");
        player1.setFacade(facade);
        player1.getZumbaBooking();
    }
}

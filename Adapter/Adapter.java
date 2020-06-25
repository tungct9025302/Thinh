import java.time.LocalDateTime;

public class Adapter extends ZumbaClass {
    private BadmintonCourt badmintonCourt;

    public Adapter(LocalDateTime localDateTime) {
        super(localDateTime);
    }


    public void exchange(LocalDateTime localDateTime){
        int min = localDateTime.getMinute();
        badmintonCourt.addMinute(min);
    }
}

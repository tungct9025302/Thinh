import java.nio.channels.Channel;

public abstract class Build {

    public void getInfo(){
        Champions champions = getChampion();
        champions.getRune();
    }

    public  abstract Champions getChampion();

}

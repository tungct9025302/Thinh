import java.util.Scanner;

public class Demo {

    private static Build build;

    public static void main(String[] args){
        selectChamp();
        getGuide();
    }
    static void selectChamp(){
        System.out.println("Kata or Riven?");
        Scanner scanner = new Scanner(System. in);
        String input = scanner. nextLine();

        if(input.equals("Riven")){
            build=new ADchamp();
        }
        else if(input.equals("Kata")){
            build=new APchamp();
        }
        else{
            build=new Tip();
        }

    }
    static void getGuide(){
        build.getInfo();
    }

}

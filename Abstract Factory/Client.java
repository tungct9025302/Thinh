public class Client {
    public static void main(String[] args) {
        AbstractFactory factory;

        if(args.length>0){
            factory=new FirstFactory();
        }
        else{
            factory=new SecondFactory();
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(factory.getClone() + " ");
        }
        System.out.println(factory.getMainMaterial());
        System.out.println(factory.getStageCooking());




    }
}

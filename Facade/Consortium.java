public class Consortium extends PaymentMethod{
    Consortium(){

    }
    @Override
    public void pay() {
        System.out.println("Paid with Consortium");
    }
}

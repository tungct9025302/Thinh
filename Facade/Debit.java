public class Debit extends PaymentMethod {
   Debit(){

   }


    @Override
    public void pay() {
        System.out.println("Paid with Debit");
    }
}

public class Facade {
    private Booking booking;
    private PaymentMethod paymentMethod;
    public void bookWithZumba(){
        booking = new Zumba();
        booking.book();
        paymentMethod=new Consortium();
        paymentMethod.pay();
    }
    public void bookWithBadmintonCourt(){
        booking=new BadmintonCourt();
        booking.book();
        paymentMethod=new Debit();
        paymentMethod.pay();
    }

}

public class PayPal extends Payment{
    public PayPal(){
        super("Khong tien mat", "PayPal");
    }

    @Override
    public void amount(double amount){
        System.out.println("Thanh toan " + amount + " bang " + namePayment);
    }
}
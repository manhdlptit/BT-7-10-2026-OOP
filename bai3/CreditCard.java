public class CreditCard extends Payment{
    public CreditCard(){
        super("Khong tien mat", "Credit Card");
    }
    @Override
    public void amount(double amount){
        System.out.println("Thanh toan " + amount + " bang " + namePayment);
    }
}
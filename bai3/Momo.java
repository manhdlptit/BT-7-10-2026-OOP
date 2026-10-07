public class Momo extends Payment{
    public Momo(){
        super("Khong tien mat", "momo");
    }
    @Override
    public void amount(double amount){
        System.out.println("Thanh toan " + amount + " bang " + namePayment);
    }
}
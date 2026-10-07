public class Cash extends Payment{
    public Cash(){
        super("Tien mat", "Tien mat");
    }
    @Override
    public void amount(double amount){
        System.out.println("Thanh toan " + amount + " bang " + namePayment);
    }
}
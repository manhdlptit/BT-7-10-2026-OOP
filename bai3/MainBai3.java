public class MainBai3 {
    public static void main(String[] args){
        Order kh1 = new Order("An", 200.000, new CreditCard());
        Order kh2 = new Order("Binh", 150.000, new PayPal());
        Order kh3 = new Order("Chi", 100.000, new Cash());
        Order kh4 = new Order("Dung", 300.000, new Momo());

        kh1.checkout();
        kh2.checkout();
        kh3.checkout();
        kh4.checkout();
    }
}
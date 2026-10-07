public class Order{
    String nameKH;
    double moneyKH;
    Payment paymentKH;
    public Order(String name, double money, Payment payment){
        this.nameKH = name;
        this.moneyKH = money;
        this.paymentKH = payment;
    }

    public void checkout(){
        System.out.println("Khach hang " + nameKH);
        paymentKH.amount(moneyKH);
    }
}
public abstract class Payment {
    public String typePayment;
    public String namePayment;
    public Payment(String type, String name){
        this.typePayment = type;
        this.namePayment = name;
    }

    public String getType(){
        return typePayment;
    }

    public String getName(){
        return namePayment;
    }

    public abstract void amount(double price);
}
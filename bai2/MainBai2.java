package bai2;

public class MainBai2 {
    public static void main(String[] args){
        OfficeEmployee OE = new OfficeEmployee();
        SalesEmployee SE = new SalesEmployee();
        TechnicalEmployee TE = new TechnicalEmployee();

        OE.sendMail();

        SE.sendMail();
        SE.sell();

        TE.sendMail();
        TE.coding();
     }
}
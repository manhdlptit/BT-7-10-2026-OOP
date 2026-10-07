public class MainBai2 {
    public static void main(String[] args){
        OfficeEmployee oe = new OfficeEmployee();
        TechnicalEmployee te = new TechnicalEmployee();
        SalesEmployee se = new SalesEmployee();

        oe.sendEmail();

        te.coding();
        te.sendEmail();

        se.sell();
        se.sendEmail();
    }
    
}
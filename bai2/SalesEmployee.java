package bai2;

public class SalesEmployee implements EmailSender, Salesperson{
    @Override
    public void sendMail() {
        System.out.println("Gui mail");
    }

    @Override
    public void sell() {
        System.out.println("Ban hang");
    }
}
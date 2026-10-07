package bai2;

public class OfficeEmployee implements EmailSender{
    @Override
    public void sendMail() {
        System.out.println("Gui mail");
    }
}
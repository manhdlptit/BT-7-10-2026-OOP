package bai2;

public class TechnicalEmployee implements EmailSender, Programmer {
    @Override
    public void coding() {
        System.out.println("Coding");
    }

    @Override
    public void sendMail() {
        System.out.println("Gui mail");
    }
}
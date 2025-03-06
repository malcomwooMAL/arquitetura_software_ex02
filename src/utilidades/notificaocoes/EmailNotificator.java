package utilidades.notificaocoes;

public class EmailNotificator implements Notificator {
    @Override
    public void runNotification() {
        System.out.println("An email notification has been sent! Check your email :D");
    }
}

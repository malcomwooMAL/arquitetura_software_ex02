package utilidades.notificaocoes;

public class SMSNotificator implements Notificator {
    @Override
    public void runNotification() {
        System.out.println("A SMS notification has been sent to your phone! Check your sms messages! :D");
    }
}

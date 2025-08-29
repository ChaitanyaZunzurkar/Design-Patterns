package Factory.Notifications;

public class SMS extends Notifications {
    @Override
    void sendNotification() {
        System.out.println("Notification is send thorough SMS.");
    }
}

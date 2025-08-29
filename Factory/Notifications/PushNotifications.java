package Factory.Notifications;

public class PushNotifications extends Notifications {
    @Override
    void sendNotification() {
        System.out.println("Notification is send through push notification.");
    }
}

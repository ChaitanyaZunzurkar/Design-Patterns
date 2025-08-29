package Factory.Notifications;

public class NotificationFactory {

    private Notifications notification;

    public Notifications getNotification (int type) {
        if(type == 1) {
            notification = new PushNotifications(); 
        } else if(type == 2) {
            notification = new Email();
        } else {
            notification = new SMS();
        }
        return notification;
    }
}

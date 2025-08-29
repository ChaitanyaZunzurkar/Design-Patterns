package Factory.Notifications;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NotificationFactory factory = new NotificationFactory();

        System.out.println("Choose Notification Type:");
        System.out.println("1. Push Notification");
        System.out.println("2. Email");
        System.out.println("3. SMS");

        int choice = sc.nextInt();

        Notifications notify = factory.getNotification(choice);

        if (notify != null) {
            notify.sendNotification();
        } else {
            System.out.println("Invalid choice! Please select 1, 2, or 3.");
        }

        sc.close();
    }
}

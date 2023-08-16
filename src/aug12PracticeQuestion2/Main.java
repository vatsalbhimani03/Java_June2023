package aug12PracticeQuestion2;

import org.w3c.dom.ls.LSOutput;

//        Create an interface NotificationSender with a method sendNotification(String message) to represent the basic notification sending functionality.
//        Create interfaces for different notification channels, such as EmailNotification with methods for setting recipients and sending email notifications, SMSNotification with methods for specifying phone numbers and sending SMS notifications, and PushNotification with methods for sending push notifications to devices.
//        Implement classes that represent each notification channel (e.g., EmailNotificationSender, SMSNotificationSender, PushNotificationSender) that implement the corresponding interfaces.
//        Each notification channel class should encapsulate the logic for sending notifications through its respective channel.
//        Design the architecture in a way that new notification channels can be added with minimal code modifications.

public class Main {
    public static void main(String[] args) {
        EmailNotificationSender emailSender = new EmailNotificationSender();
        SMSNotificationSender smsSender = new SMSNotificationSender();
        PushNotificationSender pushSender = new PushNotificationSender();

        String[] emails = {"vatsalbhimani20@gmail.com", "vbhimani@belltechsolutions.ca"};
        emailSender.setRecipients(emails);
        emailSender.sendNotification("Email sent SUCCESSFULLY");

        String[] phoneNumbers = {"1478523690", "75394514862"};
        smsSender.setPhoneNumbers(phoneNumbers);
        smsSender.sendNotification("SMS sent SUCCESSFULLY");

        String[] deviceID = {"BUF5BVH6SB6V", "B4HED3VH4WEJ"};
        pushSender.setDevice(deviceID);
        pushSender.sendNotification("Push notification sent SUCCESSFULLY");

    }
}

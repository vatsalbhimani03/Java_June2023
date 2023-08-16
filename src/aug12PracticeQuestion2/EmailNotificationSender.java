package aug12PracticeQuestion2;

public class EmailNotificationSender implements EmailNotification{
    private String[] recipients;
    @Override
    public void setRecipients(String[] recipientsEmail) {
        this.recipients = recipientsEmail;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println(message);
    }
}

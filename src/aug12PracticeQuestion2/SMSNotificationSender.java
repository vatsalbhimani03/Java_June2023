package aug12PracticeQuestion2;

public class SMSNotificationSender implements SMSNotification{
    private String[] number;
    @Override
    public void setPhoneNumbers(String[] phoneNumber) {
        this.number = phoneNumber;
    }
    @Override
    public void sendNotification(String message) {
        System.out.println(message);
    }


}

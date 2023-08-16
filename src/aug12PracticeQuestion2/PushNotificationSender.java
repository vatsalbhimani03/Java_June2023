package aug12PracticeQuestion2;

public class PushNotificationSender implements PushNotification{

    private String[] id;
    @Override
    public void sendNotification(String message) {
        System.out.println(message);
    }

    @Override
    public void setDevice(String[] deviceID) {
        this.id = deviceID;
    }
}

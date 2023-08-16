package aug12;

public class Mobile implements Computer, Telephone, Camera{


    @Override
    public void recordingVideo() {
        System.out.println("Recording a Video");
    }
    public void recordingVideo(int x) {
        System.out.println(x);
    }

    @Override
    public void takingPicture() {
        System.out.println("Taking a picture");
    }

    @Override
    public void calculating() {
        System.out.println("Calculating Stuff");
    }

    @Override
    public void playingVideo() {
        System.out.println("Playing a Video");
    }

    @Override
    public void makeCalls() {
        System.out.println("Making Calls");
    }

    @Override
    public void receiveCalls() {
        System.out.println("Receiving calls");
    }

    public int recordingVideo(int i, int j){
        return 100;
    }
}

package aug15;

public class Chair implements Furniture{
    @Override
    public void sit() {
        System.out.println("Sitting on the Chair");
    }

    @Override
    public void stand() {
        System.out.println("Standing on the Chair");
    }
}

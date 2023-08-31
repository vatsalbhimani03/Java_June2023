package aug15;

public class Table implements Furniture{
    @Override
    public void sit() {
        System.out.println("Sitting on the Table");
    }

    @Override
    public void stand() {
        System.out.println("Standing on the Table");
    }
}

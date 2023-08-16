package aug8;

public class Car extends Vehicle{
    private int made;
    private int millage;

    public Car( String model, String color, int made, int millage) {
        super(model, color);
        this.made = made;
        this.millage = millage;
    }


    public void printDetails(){
        super.printDetails();
        System.out.println("The Vehicle made in "+made+" & millage is "+millage);
    }
}

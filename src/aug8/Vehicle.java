package aug8;

public class Vehicle {
    private String model;
    private String color;

    public Vehicle(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void printDetails(){
        System.out.println("The Vehicle model is "+model+" & color is "+color);
    }
}

package june27;

public class SwappingNumbers {
    public static void main(String[] args) {
        int x = 100;
        int y = 200;
        int temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("The value of X is: "+ x + " and Y is: "+ y);
    }
}

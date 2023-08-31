package aug19.EnumPractice;

import java.util.Scanner;

public class AmazonCheckOut {
    public static void main(String[] args) {
        checkingOut();

        Scanner s = new Scanner(System.in);
        System.out.println("Enter type of Payment which you want to use: ");



        PaymentMethod type = PaymentMethod.VISA;
        switch (type){
            case VISA:
                System.out.println("Paid By VISA");
                break;
            case MASTERCARD:
                System.out.println("Paid By MASTERCARD");
                break;
            case AMEX:
                System.out.println("Paid By AMEX");
                break;
            case PAYPAL:
                System.out.println("Paid By PAYPAL");
                break;

        }
    }

    public static void checkingOut(){
        System.out.println("I will pay with "+ PaymentMethod.VISA +" Because I don't have " + PaymentMethod.PAYPAL + "Account");
    }
}

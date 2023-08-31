package aug19.ThrowThrowsKeyword;

import java.util.Scanner;

public class DriveRulesMain {
    public static void main(String[] args) throws AgeLimitException {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your Name: ");
        String userName = s.nextLine();
        System.out.println("Please enter your age: ");
//        int userAge = Integer.parseInt(s.nextLine());
        int userAge = s.nextInt();
        DriveRules drivingRules =new DriveRules();
        drivingRules.drivingCar(userAge, userName);
    }
}

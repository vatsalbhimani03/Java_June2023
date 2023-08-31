package aug19.ThrowThrowsKeyword;


public class DriveRules {

    public int age;

    public String name;


    public void drivingCar(int age, String name) throws AgeLimitException {


        if (age<=18){
            throw new AgeLimitException("Age limit must be 18 year to drive a car");
        }
        else{
            System.out.println("You're eligible to drive a car");
        }

    }
    public void restrictionDriving(){

    }
}

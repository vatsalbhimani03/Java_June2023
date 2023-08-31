package aug19;

public class ExceptionDemo {

    public static void main(String[] args) {
        int[] numbers = new int[10];

        numbers[9] = 10;
        System.out.println(numbers[9]);

        try{
            numbers[10] = 100;
            System.out.println(numbers[10]);

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            e.printStackTrace();
        }
        catch(RuntimeException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("This is finally block");
        }

        System.out.println(numbers[8]);
        System.out.println(numbers[7]);


    }
}

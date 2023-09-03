package july4july8;

import java.util.Scanner;

public class PractiseQ1 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        // difference between next() and nextLine()
        // next() - it will see white space and only read content till white space
        // nextLine() - it will read all the content of the userInput string including white space


        System.out.println("Enter Number1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Number2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter Number3: ");
        int num3 = sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println(num1 + " is maximum from "+num2+" and "+num3);
        } else if(num2>num1 && num2>num3){
            System.out.println(num2 + " is maximum from "+num1+" and "+num3);
        } else{
            System.out.println(num3 + " is maximum from "+num1+" and "+num2);
        }


        int x;
//
//        System.out.println("Enter the number between 1 to 7: ");
//        x=sc.nextInt();

        do{
            System.out.println("Enter the number between 1 to 7: ");
            x=sc.nextInt();
        } while(!(x>=1 && x<=7));


//        if(x==1){
//            System.out.println("It's a Sunday");
//        } else if(x==2){
//            System.out.println("It's a Monday");
//        } else if(x==3){
//            System.out.println("It's a Tuesday");
//        } else if(x==4){
//            System.out.println("It's a Wednesday");
//        } else if(x==5){
//            System.out.println("It's a Thursday");
//        }else if(x==6){
//            System.out.println("It's a Friday");
//        } else {
//            System.out.println("It's a Saturday");
//        }

        switch (x) {
            case 1 -> System.out.println("It's a Sunday");
            case 2 -> System.out.println("It's a Monday");
            case 3 -> System.out.println("It's a Tuesday");
            case 4 -> System.out.println("It's a Wednesday");
            case 5 -> System.out.println("It's a Thursday");
            case 6 -> System.out.println("It's a Friday");
            case 7 -> System.out.println("It's a Saturday");
            default -> System.out.println("It's not a day"); // it's not gonna fall in default case because of do while loop
        }



        // different pattern using nested for loop

        for(int i=0;i<5; i++){
            for(int j=5; j>i; j--){
                System.out.print("*");
            }
            for(int k=i; k<4; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

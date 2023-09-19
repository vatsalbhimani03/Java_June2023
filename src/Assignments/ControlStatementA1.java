package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ControlStatementA1 {

//    ALL OF THESE PROBLEMS SHOULD BE DONE IN WHILE LOOP, DO WHILE LOOP, FOR LOOP.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n***************** 1st Question *******************");

// 1. Write a Java program that takes three numbers from the user and prints the greatest number.
        int[] num = new int[3];
        System.out.println("Please enter 3 different numbers: ");
        num[0] = sc.nextInt();
        num[1] = sc.nextInt();
        num[2] = sc.nextInt();
        System.out.println(Arrays.toString(num));

        for (int z: num) {
            System.out.println(z);
        }

        int max = num[0];

//        for (int i = 0; i < num.length; i++) {
//            if(max < num[i]){
//                max = num[i];
//            }
//        }
        int a=0;
        while(a< num.length){
            if(max<num[a]) {
                max = num[a];
            }
            a++;
        }
        System.out.println("The greatest number from 3 values is " + max);



        System.out.println("\n***************** 2nd Question *******************");

//        2. Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

//        char userInput = sc.next().charAt(0);
        String userInput;
        int count = 0;
        do {
            System.out.println("Enter single character from the alphabet: ");
            userInput = sc.next();
            count++;
        }
        while(userInput.length() != 1);

//        String uInput = String.valueOf(userInput.charAt(0)).toLowerCase(); // converting to single char
        char uInput = userInput.toLowerCase().charAt(0);

        if(uInput == 'a' || uInput=='e' || uInput=='i' || uInput=='o' || uInput=='u'){
            System.out.println("You have entered "+ userInput + " character with "+ count +" try, Which is VOWEL");
        } else {
            System.out.println("You have entered "+ userInput + " character with "+ count +" try, Which is CONSONANT");
        }


        System.out.println("\n***************** 3rd Question *******************");

//        3. Write a Java program to display the first 10 natural numbers. with for, while, do while loop

        System.out.println("The first 10 natural numbers are as below: ");
        for(int i=1; i<=10; i++){
            System.out.print(" "+i);
        }
        System.out.println();
        int j=1;
        while(j<=10){
            System.out.print(" "+j);
            j++;
        }
        System.out.println();
        int k=1;
        do{
            System.out.print(" "+k);
            k++;
        } while(k<=10);




        System.out.println("\n***************** 4th Question *******************");

//        4.Write a Java program to display n terms of natural numbers and their sum and factorial.

        System.out.println("Enter the size of n natural number which you want sum of: ");
        int n = sc.nextInt();
        System.out.println("The "+ n +" natural numbers are as below: ");
        int sum = 0;
        int multi = 1;
        for(int i=1; i<=n; i++){
            System.out.print(" "+i);
            sum += i;
            multi *= i;
        }
        System.out.println("\nThe sum of "+ n +" natural numbers are " + sum);
        System.out.println("The factorial of "+ n +" natural numbers are " + multi);


        System.out.println("\n***************** 5th Question *******************");


//        5.Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int[] num5 = new int[size];
        System.out.println("Enter 5 different numbers: ");
        for (int i = 0; i < size; i++) {
            num5[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(num5));

        int sum5 = 0;
        for (int x: num5) {
            sum5 += x;
        }
        float avg5 = (float) sum5 /size;
        System.out.println("The sum of all numbers in array is "+ sum5 +" And average of all numbers are "+ avg5);



        System.out.println("\n***************** 6th Question *******************");


//        6.Write a Java program to display the cube of the given number up to an integer.

        System.out.println("Enter the number of which you want the cube of each number upto integer(1): ");
        int num6 = sc.nextInt();

        System.out.println("Cube of each numbers from "+num6+" to 1 are as below: ");
        for (int i = num6; i >= 1; i--) {
            System.out.println("The cube of "+ i + " is equals to "+i+" rest to 3 = "+ (i * i * i));
        }




        System.out.println("\n***************** 7th Question *******************");


//        7. Write a Java program to display the multiplication table of a given integer.
        System.out.println("Enter the number of which you want a multiplication table: ");
        int num7 = sc.nextInt();
        System.out.println("The table of "+ num7+" is as below:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num7+" * "+i+" = "+num7*i);
        }




        System.out.println("\n***************** 8th Question *******************");

//        8.Write a Java program that displays the sum of n odd natural numbers.
        System.out.println("How many odd natural numbers you want: ");
        int num8 = sc.nextInt(), sum8=0;
        for (int i = 0; i <=num8*2; i++) {
            if(i%2==1){
                sum8 += i;
            }
        }
        System.out.println("The sum of "+num8+ " odd natural numbers is "+sum8);




        System.out.println("\n***************** 9th Question *******************");


//        9. Write a Java program that prints "Pragra "whenever you encounter an even number ranges from 1 to 10.

        // repeat 10 times in for loop
        for (int i = 1; i <=10; i++) {
            int num9;
            do{
                System.out.println("Enter any even number between 1 to 1000");
                num9 = sc.nextInt();

            }while(num9%2!=0 || num9>1000 || num9<1);
            System.out.println("This is even number between 1 to 1000: "+ num9);
            System.out.println("Pragra");
        }


    }
}

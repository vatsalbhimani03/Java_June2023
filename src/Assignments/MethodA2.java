package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class MethodA2 {

    Scanner sc = new Scanner(System.in);

    // 1st
    public int[] arrayValueFromUser(){
        System.out.println("\n***************** 1st Question *******************");

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] num = new int[size];
        System.out.println("Please enter values for array in different numbers: ");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        return num;
    }
    public int findGreatestNumber(int[] num){
        System.out.println("Array is :"+ Arrays.toString(num));
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if(max < num[i]){
                max = num[i];
            }
        }
        return max;
    }
    public void printingMaxValue(int max){
        System.out.println("The greatest number from array is " + max);
    }


    // 2nd
    public void verifyingCharacter(){
//        char userInput = sc.next().charAt(0);

        System.out.println("\n***************** 2nd Question *******************");

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
        int uInputAscii = uInput;
        System.out.println("Ascii value of "+uInput+" is "+uInputAscii);

        if(uInput == 'a' || uInput=='e' || uInput=='i' || uInput=='o' || uInput=='u'){
            System.out.println("You have entered "+ userInput + " character with "+ count +" try, Which is VOWEL");
        } else if (uInputAscii>=97 && uInputAscii<=122){
            System.out.println("You have entered "+ userInput + " character with "+ count +" try, Which is CONSONANT");
        } else {
            System.out.println("You have not entered Single character from alphabet");
        }
    }


    // 3rd
    public void first10NaturalNumbers(){

        System.out.println("\n***************** 3rd Question *******************");

        System.out.println("The first 10 natural numbers are as below: ");
        int j=1;
        while(j<=10){
            System.out.print(" "+j);
            j++;
        }
    }

    // 4th
    public int gettingSizeFromUser(){
        System.out.println("\n\n***************** 4th Question *******************");

        System.out.println("Enter the size of n natural number which you want sum & factorial of: ");
        int n = sc.nextInt();

        return n;
    }
    public int SumOfnNumbers(int n){
        System.out.println("The "+ n +" natural numbers are as below: ");
        int sum = 0;
        for(int i=1; i<=n; i++){
            System.out.print(" "+i);
            sum += i;
        }
        return sum;
    }
    public int FactorialOfnNumbers(int n){
        int multi = 1;
        for(int i=1; i<=n; i++){
            multi *= i;
        }
        return multi;
    }
    public void printingSumAndFactorial(int n, int sum, int factorial){
        System.out.println("\nThe sum of "+ n +" natural numbers are " + sum);
        System.out.println("The factorial of "+ n +" natural numbers are " + factorial);
    }


    // 5th
    public void findSumAndAvg(){
        System.out.println("\n***************** 5th Question *******************");

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int[] num5 = new int[size];
        System.out.println("Enter n("+size+") different numbers: ");
        for (int i = 0; i < size; i++) {
            num5[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(num5));

        int sum5 = 0;
        for (int x: num5) {
            sum5 += x;
        }
        float avg5 = (float) sum5 /size;
        System.out.println("The sum of all numbers in array are "+ sum5 +" And average of all numbers are "+ avg5);
    }


    // 6th
    public int userInput(){
        System.out.println("\n***************** 6th Question *******************");

        System.out.println("Enter the number of which you want the cube of each number upto integer(1): ");
        return sc.nextInt();
    }
    public void convertingIntoCube(int n){
        System.out.println("Cube of each numbers from "+n+" to 1 are as below: ");
        for (int i = n; i >= 1; i--) {
            System.out.println("The cube of "+ i + " is equals to "+i+" rest to 3 = "+ (i * i * i));
        }
    }


    // 7th
    public int givenIntFromUser(){
        System.out.println("\n***************** 7th Question *******************");

        System.out.println("Enter the number of which you want a multiplication table: ");
        return sc.nextInt();
    }
    public void displayMultiplicationTable(int num7){
        System.out.println("The table of "+ num7+" is as below:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num7+" * "+i+" = "+num7*i);
        }
    }


    // 8th
    public int oddNumbersFromUser(){
        System.out.println("\n***************** 8th Question *******************");

        System.out.println("How many odd natural numbers you want: ");
        return sc.nextInt();
    }
    public void sumOfOddNaturalNumbers(int num8){
        int sum8=0;
        int[] arr = new int[num8];
        for (int i = 0; i <=num8*2; i++) {
            if(i%2==1){
                Arrays.fill(arr, i);
                sum8 += i;
            }
        }
        System.out.println("Odd natural numbers are " + Arrays.toString(arr));
        System.out.println("The sum of "+num8+ " odd natural numbers is "+sum8);
    }


    // 9th
    public void printingStrOnEvenNumber(){
        System.out.println("\n***************** 9th Question *******************");

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


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

// write all functions / methods
        MethodA2 q1 = new MethodA2();  // initializing the instance(q1) of the class(MethodA2)

// 1. Write a Java program that takes three numbers from the user and prints the greatest number.
        int[] num = q1.arrayValueFromUser();
        int maximumValue = q1.findGreatestNumber(num); // passing array in method
        q1.printingMaxValue(maximumValue);


//        2. Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
        q1.verifyingCharacter();

//        3. Write a Java program to display the first 10 natural numbers.
        q1.first10NaturalNumbers();

//        4.Write a Java program to display n terms of natural numbers and their sum and factorial.
        int n = q1.gettingSizeFromUser();
        q1.printingSumAndFactorial(n, q1.SumOfnNumbers(n), q1.FactorialOfnNumbers(n));

//        5.Write a program in Java to input 5 numbers from the keyboard and find their sum and average.
        q1.findSumAndAvg();

//        6.Write a Java program to display the cube of the given number up to an integer.
        int num6 = q1.userInput();
        q1.convertingIntoCube(num6);

//        7. Write a Java program to display the multiplication table of a given integer.
        q1.displayMultiplicationTable(q1.givenIntFromUser());

//        8.Write a Java program that displays the sum of n odd natural numbers.
        q1.sumOfOddNaturalNumbers(q1.oddNumbersFromUser());

//        9. Write a Java program that prints "Pragra "whenever you encounter an even number ranges from 1 to 10.
        q1.printingStrOnEvenNumber();

    }

}

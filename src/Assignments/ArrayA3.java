package Assignments;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class ArrayA3 {

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
    public int findingLargestNumber(int[] num){
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
        System.out.println("The largest number from array is " + max);
    }


    // 2nd
    public int findingSmallestNumber(int[] num){
        System.out.println("\n***************** 2nd Question *******************");

        System.out.println("Array is :"+ Arrays.toString(num));
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if(min > num[i]){
                min = num[i];
            }
        }
        return min;
    }
    public void printingMinValue(int min){
        System.out.println("The smallest number from array is " + min);
    }


    // 3rd
    public int[] reversingArray(int[] num){
        System.out.println("\n***************** 3rd Question *******************");

        int[] arr = new int[num.length];
        int j = num.length;
        for (int i = 0; i < num.length; i++) {
            arr[i] = num[j-1];
            j--;
        }
        return arr;
    }


    // 4th
    public String[] arrayFromUser(){
        System.out.println("\n***************** 4th Question *******************");

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        String[] arr = new String[size];
        System.out.println("Please enter values for array in different words: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.next();
        }
        return arr;
    }
    public boolean findElementFromArray(String[] arr, String checkValue){
        boolean result = false;
        for (String i : arr) {
            if(Objects.equals(i, checkValue)){
                result = true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        ArrayA3 a3 = new ArrayA3();
//
//        1. Write a java program to find the largest number in an array
        int[] num = a3.arrayValueFromUser();
        int maximumValue = a3.findingLargestNumber(num); // passing array in method
        a3.printingMaxValue(maximumValue);

//        2. Write a java program to find the smallest number in an array
        int minimumValue = a3.findingSmallestNumber(num);
        a3.printingMinValue(minimumValue);

//        3. write a java program to reverse an array.
        int[] num3 = a3.arrayValueFromUser();
        System.out.println("Regular Array is "+ Arrays.toString(num3));
        System.out.println("Reversed Array is "+ Arrays.toString(a3.reversingArray(num3)));

//        4. write a java program to find an element(word) in array.
        String[] arr4 = a3.arrayFromUser();
        System.out.println(Arrays.toString(arr4));
        System.out.println("Element found: "+a3.findElementFromArray(arr4, "vatsal"));

    }
}

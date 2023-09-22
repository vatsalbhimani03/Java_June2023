package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class StringA4 {
    Scanner sc = new Scanner(System.in);

    //1st
    public void reverseString(String userInput){
//        String reversedStr = "";
//        StringBuffer reversedStr = new StringBuffer();
        StringBuilder reversedStr = new StringBuilder();

        for (int i = userInput.length() - 1; i >= 0; i--) {
//            reversedStr += userInput.charAt(i);
            reversedStr.append(userInput.charAt(i));
        }
        System.out.println(reversedStr);
    }

    //2nd
    public String userInput(){
        System.out.println("Enter any string you want: ");
        return sc.nextLine();
    }
    public String concatenateStr(String str1, String str2){
        String str = str1.concat(" "+str2);
        return str;
    }


    //3rd
    public String[] convertingStrToArr(String str){
        String[] arr = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = String.valueOf(str.charAt(i));
//            System.out.print(arr[i]+" ");
        }
        return arr;
    }


    //4th
    public char findCharacter(){
        System.out.println("Please enter any character which you want to find out from the string:");
        char c = sc.next().charAt(0);
        return c;
    }
    public void findSomethingFromStr(String s, char c){
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c){
                count++;
                System.out.println(c+" is got found "+count+" time at index "+i+" in "+s);
            }
        }
        if(count==0) {
            System.out.println(c+" is not found in the string "+s);
        }
    }


    public static void main(String[] args) {

        StringA4 a4 = new StringA4();

//        1. write a java program to reverse the string "Pragra"
        a4.reverseString(a4.userInput());

//        2. write the java program to concatenate one string with another (hint: use string methods)
        String str1 = a4.userInput();
        String str2 = a4.userInput();
        System.out.println(a4.concatenateStr(str1, str2));

//        3. Write a java program to convert a give String "Pragra" to an array.
        String str3 = a4.userInput();
        System.out.println(Arrays.toString(a4.convertingStrToArr(str3)));

//        4. write a java program to find a specific alphabet in the string and index of it.
//        example : find the letter 'g' in "Pragra"
        String str4 = a4.userInput();
        char c = a4.findCharacter();
        a4.findSomethingFromStr(str4, c);

    }
}

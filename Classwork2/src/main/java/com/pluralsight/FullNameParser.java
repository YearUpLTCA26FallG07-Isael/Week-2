package com.pluralsight;
import java.util.*;
public class FullNameParser {
    public static void main(String[]args){
        Scanner newScanner = new Scanner(System.in);
        System.out.print("Enter your full name:");
        String fullName = newScanner.nextLine();
        nameSplit(fullName);





    }
    public static void nameSplit(String fullName){
        int firstSpace = fullName.indexOf(" ");
        int lastSpace = fullName.lastIndexOf(" ");


        String first = fullName.substring(0 ,firstSpace);
        String middle = fullName.substring( firstSpace + 1 , lastSpace);
        String last = fullName.substring(lastSpace + 1);

        System.out.println("First name:" + first);
        System.out.println("Middle name:" + middle);
        System.out.println("Last name:" + last);



    }
}

package com.pluralsight;
import java.util.*;
public class FullNameApplication {
    public static void main(String[]args){
        Scanner newScanner = new Scanner(System.in);
        System.out.print("Enter your first name:");
        String first = newScanner.nextLine();
        System.out.print("Enter your middle name:");
        String middle = newScanner.nextLine();
        System.out.print("Enter your last name:");
        String last = newScanner.nextLine();
        System.out.print("Enter your Suffix:");
        String suffix = newScanner.nextLine();
        String fullName = first;
        if(!middle.isEmpty()){
            fullName += " " + middle;

        }
        fullName += " " + last;
        if(!suffix.isEmpty()){
            fullName += ", " + suffix;
        }
        System.out.println(fullName);




    }
}

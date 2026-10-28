package com.pluralsight;
import java.util.*;
public class theaterReseervations {
    public static void main(String[]args){
        Scanner newScanner = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = newScanner.nextLine();
        System.out.print("What date will you be coming?:");
        String date = newScanner.nextLine();
        System.out.print("How many tickets would you like?:");
        int tickets = newScanner.nextInt();
        reservationCalculator(name , date , tickets);
    }
    public static void reservationCalculator(String name , String date , int tickets){
        String firstName = name.split(" ")[0];
        String lastName = name.split(" ")[1];


        String month = date.split("/")[0];
        String day = date.split("/")[1];
        String year = date.split("/")[2];


        if(tickets > 1){
            System.out.println(tickets + " tickets reserved for " + year + "-" + month + "-" + day + " under " + lastName + ", " + firstName);
        }
        else{
            System.out.println(tickets + " ticket reserved for " + year + "-" + month + "-" + day + " under " + lastName + ", " + firstName);
        }

    }

}

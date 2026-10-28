package com.pluralsight;
import java.util.Scanner;
public class addressBuilder {
    public static void main(String[]args){
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Please provide the following information:");

        System.out.print("Full name: ");
        String name = newScanner.nextLine();

        System.out.print("Billing Street: ");
        String billStreet = newScanner.nextLine();
        System.out.print("Billing City: ");
        String billCity = newScanner.nextLine();
        System.out.print("Billing State: ");
        String billState = newScanner.nextLine();
        System.out.print("Billing zip: ");
        String billZip = newScanner.nextLine();

        System.out.print("Shipping Street: ");
        String shipStreet = newScanner.nextLine();
        System.out.print("Shipping City: ");
        String shipCity = newScanner.nextLine();
        System.out.print("Shipping State: ");
        String shipState = newScanner.nextLine();
        System.out.print("Shipping Zip: ");
        String shipZip = newScanner.nextLine();

        System.out.println(" ");
        System.out.println(name);
        System.out.println(" ");
        billingStringBuilder(billStreet , billCity , billState , billZip);
        shippingStringBuilder(billStreet , billCity , billState , billZip);
    }
    public static void billingStringBuilder(String billStreet , String billCity , String billState , String billZip){
        StringBuilder billing = new StringBuilder(billStreet + " \n");
        billing = billing.append(billCity + ", ");
        billing = billing.append(billState + " ");
        billing = billing.append(billZip + " ");
        System.out.println("Billing Address:\n" + billing);
        System.out.println(" ");


    }
    public static void shippingStringBuilder(String shipStreet , String shipCity , String shipState , String shipZip){
        StringBuilder shipping = new StringBuilder(shipStreet + " \n");
        shipping = shipping.append(shipCity + ", ");
        shipping = shipping.append(shipState + " ");
        shipping = shipping.append(shipZip + " ");
        System.out.println("Shipping Address:\n" + shipping);
    }




}

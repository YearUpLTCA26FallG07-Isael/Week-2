package com.pluralsight;
import java.util.Scanner;
public class CellPhoneAppliction {
    public static void main(String[]args){
        Scanner newScanner = new Scanner(System.in);
        CellPhone phone1 = new CellPhone();
        CellPhone phone2 = new CellPhone();
        CellPhone phone3 = new CellPhone(1456 , "Iphone 13" , "Verizon" , "742-235-2153" , "Billy");

        phone2.setSerialNumber(1245);
        phone2.setModel("Iphone 12");
        phone2.setCarrier("Verizon");
        phone2.setPhoneNumber("745-865-7441");
        phone2.setOwner("Bob");
        

        System.out.print("What is the serial number?:");
        phone1.setSerialNumber(newScanner.nextInt());

        newScanner.nextLine();

        System.out.print("What model is the phone?:");
        phone1.setModel(newScanner.nextLine());

        System.out.print("Who is the carrier?:");
        phone1.setCarrier(newScanner.nextLine());

        System.out.print("What is the phone number?:");
        phone1.setPhoneNumber(newScanner.nextLine());

        System.out.print("Who is the owner of the phone?:");
        phone1.setOwner(newScanner.nextLine());

        display(phone1);
        display(phone2);
        phone1.dial(phone2.getPhoneNumber());
        phone2.dial(phone2.getPhoneNumber());
        phone2.dial(phone3.getPhoneNumber());





    }
    public static void display(CellPhone phone1){
        System.out.println("Serial number:"+ phone1.getSerialNumber());
        System.out.println("Model:" + phone1.getModel());
        System.out.println("Carrier:" + phone1.getCarrier());
        System.out.println("Phone Number:" + phone1.getPhoneNumber());
        System.out.println("Owner:" + phone1.getOwner());

    }



}

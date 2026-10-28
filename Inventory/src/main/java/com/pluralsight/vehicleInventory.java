package com.pluralsight;
import java.util.Scanner;
public class vehicleInventory {
    static Scanner newScanner = new Scanner(System.in);
    static String[] vehicles = new String[20];
    static int vehicleCounter = 6;
    public static void main(String[]args){

        Vehicle car1 = new Vehicle(101121,"Ford Explorer", "Red", 45000, 13500);
        vehicles[0] = car1.toString();

        Vehicle car2 = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vehicles[1] = car2.toString();

        Vehicle car3 = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vehicles[2] = car3.toString();

        Vehicle car4 = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vehicles[3] = car4.toString();

        Vehicle car5 = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vehicles[4] = car5.toString();

        Vehicle car6 = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);
        vehicles[5] = car6.toString();

        int command = 0;
        while(command != 6){
            System.out.println("What do you want to do?");
            System.out.println(" 1 - List all vehicles");
            System.out.println(" 2 - Search by make/model");
            System.out.println(" 3 - Search by price range");
            System.out.println(" 4 - Search by color");
            System.out.println(" 5 - Add a vehicle");
            System.out.println(" 6 - Quit");
            System.out.print("Enter your command: ");
            command = newScanner.nextInt();
            newScanner.nextLine();
            switch(command){
                case 1 -> lists();
                case 2 -> modleSearch();
                case 3 -> priceRange();
                case 4 -> colorSearch();
                case 5 -> addVehicle();
                case 6 -> System.out.println("Thanks for stopping by!");
                default -> System.out.println("Invalid option");
            }
        }
    }
    public static void lists(){
        for(int i = 0; i < vehicleCounter; i++){
            System.out.println(vehicles[i]);
        }


    }
    public static void modleSearch(){
        System.out.print("Enter the modle name:");
        String modle = newScanner.nextLine();
        for(int i = 0; i < vehicleCounter; i++){
            if(vehicles[i].contains(modle)){
                System.out.println(vehicles[i]);
            }
        }
    }
    public static void priceRange(){
        System.out.print("What is the price for the vehicle?:");
        String price = newScanner.nextLine();
        for(int i = 0; i < vehicleCounter; i++){
            if(vehicles[i].contains(price)){
                System.out.println(vehicles[i]);
            }
        }
    }
    public static void colorSearch(){
        System.out.print("What color is the vehicle:");
        String color = newScanner.nextLine();
        for(int i = 0; i < vehicleCounter; i++){
            if(vehicles[i].contains(color)){
                System.out.println(vehicles[i]);
            }
        }
    }
    public static void addVehicle(){
        System.out.print("what is the ID for the vehicle:");
        String id = newScanner.nextLine();
        System.out.print("What is the modle name:");
        String model = newScanner.nextLine();
        System.out.print("What is the color of the Vehicle:");
        String color = newScanner.nextLine();
        System.out.print("What is the odometer reading?:");
        String odometer = newScanner.nextLine();
        System.out.print("What is the price?:");
        String price = newScanner.nextLine();
        vehicles[vehicleCounter] = id + ", " + model + ", " + color + ", " + odometer + ", " + price;
        vehicleCounter += 1;
        System.out.println("Vehicle was added to the list");
        }

    }


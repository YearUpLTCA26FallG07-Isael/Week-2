package com.pluralsight;
import java.util.Scanner;
public class Library {
    static Scanner newScanner = new Scanner(System.in);
    static Book[] books = new Book[20];
    public static void main(String[]args){
        books[0] = new Book(1, "9780134685991", "Effective Java");
        books[1] = new Book(2, "9780596009205", "Head First Java");
        books[2] = new Book(3, "9781617294945", "Java Concurrency in Practice");
        books[3] = new Book(4, "9781492072508", "Modern Java in Action");
        books[4] = new Book(5, "9780135166307", "Core Java Volume I");
        books[5] = new Book(6, "9780135166314", "Core Java Volume II");
        books[6] = new Book(7, "9781119235552", "OCA Java SE 8 Programmer I");
        books[7] = new Book(8, "9781119619130", "OCP Java SE 11 Programmer");
        books[8] = new Book(9, "9780132350884", "Clean Code");
        books[9] = new Book(10, "9780201633610", "Design Patterns");

        books[10] = new Book(11, "9780134494166", "Clean Architecture");
        books[11] = new Book(12, "9780321356680", "Effective C++");
        books[12] = new Book(13, "9781491950357", "Learning React");
        books[13] = new Book(14, "9781492056270", "Spring in Action");
        books[14] = new Book(15, "9781617297571", "Spring Boot in Action");
        books[15] = new Book(16, "9781491900864", "Java 8 in Action");
        books[16] = new Book(17, "9780321349606", "Java Puzzlers");
        books[17] = new Book(18, "9780134177304", "Java: The Complete Reference");
        books[18] = new Book(19, "9780131872486", "Thinking in Java");
        books[19] = new Book(20, "9781491903995", "Mastering Java");

        int command = 0;
        while(command != 3){
            System.out.println("\n=== Library Home Screen ===");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            command = newScanner.nextInt();
            newScanner.nextLine();
            switch (command) {
                case 1: showAvailableBooks();
                break;
                case 2: showCheckedOutBooks();
                break;
                case 3: System.out.println("Thank you for using the library system!");
                break;
                default: System.out.println("Invalid choice. Please try again.");
                break;
            }
        }


    }
    public static void showAvailableBooks(){
        for(Book book : books){
            if(!book.isCheckedOut()){
                
            }
        }
    }
    public static void showCheckedOutBooks(){

    }
    public static void checkOut(String name){

    }
    public static void checkIn(){

    }
}

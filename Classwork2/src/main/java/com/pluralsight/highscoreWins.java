package com.pluralsight;
import java.util.*;
import java.util.regex.Pattern;

public class highscoreWins {
    public static void main(String[]args){
        Scanner newScanner = new Scanner(System.in);
        System.out.print("Enter the team and score for the event:");
        String game = newScanner.nextLine();
        scoreCalculator(game);

    }
    public static void scoreCalculator(String game) {
        String teams = game.split(Pattern.quote("|"))[0];
        String scores = game.split(Pattern.quote("|"))[1];
        String home = teams.split(":")[0];
        String visitor = teams.split(":")[1];
        int homeScore = Integer.parseInt(scores.split(":")[0]);
        int visitorScore = Integer.parseInt(scores.split(":")[1]);
        if(homeScore > visitorScore){
            System.out.println(home + " is the winner!");
        }
        else if(homeScore == visitorScore){
            System.out.println("Its a tie");
        }
        else{
            System.out.println(visitor + " is the winner!");
        }

    }
}

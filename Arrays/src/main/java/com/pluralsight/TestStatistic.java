package com.pluralsight;

public class TestStatistic {
    public static void main(String[] args) {
        int[] scores = {10, 98, 74, 45, 75, 89, 100, 5, 47, 41};
        int sum = 0;
        int high = scores[0];
        int low = scores[0];
        for (int i = 0; i < 10; i++) {
            sum += scores[i];
            if (high < scores[i]) {
                high = scores[i];
            }
            if(low > scores[i]){
                low = scores [i];
            }
        }
        int average = sum / 10;
        System.out.println("Average:" + average);
        System.out.println("High score:" + high);
        System.out.println("Low score:" + low);



    }
}


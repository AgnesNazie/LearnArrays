package com.agnes;

public class Arrays {
    public static void main(String[] args) {
        exe1();

    }

    public static void exe1() {
        //Task:
        //Create an array to store 5 student scores (integers).
        //Assign values to the array.
        //Print each score with its index.
        //Calculate and print the average score.

        int[] studentScore = {55, 35, 65, 75, 80};
        int sum = 0;
        for (int i = 0; i <studentScore.length; i++) {
            sum += studentScore[i];
        }
        double average = (double) sum / studentScore.length;
        System.out.println("The sum is : " + sum);
        System.out.println("The average is : " + average);

    }
}



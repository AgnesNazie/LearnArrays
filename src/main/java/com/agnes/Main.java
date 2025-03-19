package com.agnes;

public class Main {
    public static void main(String[] args) {
        exe1();
        exe2();
        exe3();
        exe4();
    }

    public static void exe1() {
        System.out.println("EXERCISE 1");
        // create an array and print all elements
        //array elements[10, 20, 30, 40, 50].
        int[] numbers = {10, 20, 30, 40, 50};
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void exe2() {
        /* find the sum of all elements in an array
        arrays elements [5,10,15].
         */
        System.out.println("\nEXERCISE 2");
        int[] numbers = {5, 10, 15};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("The sum is : " + sum);
    }

    public static void exe3() {
         /* find the largest and smallest number in an array
       arrays elements [4,9,2,7,6]
        */
        System.out.println("EXERCISE 3");
        // declared array and initialized it
        int[] numbers = {4, 9, 2, 7, 6};
        // declared variables and initialized it
        int largest = numbers[0];
        int smallest = numbers[0];
        // loop to find small and largest number
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
        }
        System.out.print("The smallest number is :" + smallest);
        System.out.println("\n The largest number is : " + largest);
    }

    public static void exe4() {
        // print an array in reverse order [1,2,3,4,5]
        System.out.println("EXERCISE 4");
        // declare and initialize elements in the array
        int[] numbers = {1, 2, 3, 4, 5};
        //declare variable to temporary store data
        int reverse;
        for (int i = 0; i < numbers.length / 2; i++) {
            reverse = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 -i] = reverse;
        }
        for (int number : numbers) {
            System.out.print(number);
        }

    }
}


package com.agnes;

public class Main {
    public static void main(String[] args) {
        exe1();
        exe2();
        exe3();
        exe4();
        exe5();
        exe6();
        exe7();
        exe8();
        exe9();
        exe10();
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
            numbers[numbers.length - 1 - i] = reverse;
        }
        for (int number : numbers) {
            System.out.print(number);
        }

    }

    public static void exe5() {
        //count how many numbers are odd and even in the array [3,4,7,8,10]
        System.out.println("\nEXERCISE 5");
        // declare and initialise arrays
        int[] numbers = {3, 4, 7, 8, 10};
        // declare and initialise variables to store the odd and even numbers
        int odd = 0;
        int even = 0;
        // loop to count numbers
        for (int number : numbers) {
            // check if number is even
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.print("The oddcount: " + odd);
        System.out.print("\nThe evencount: " + even);
    }

    public static void exe6() {
        // calculate the average of array elements[1,2,3,4,5,]
        System.out.println("\nEXERCISE 6");
        //declare and initialize array elements
        int[] numbers = {1, 2, 3, 4, 5};
        //declare and initialize variable to store data
        int sum = 0;
        //loop and calculate the sum
        for (int number : numbers) {
            sum += number;
        }
        //declare and initialize average
        double average = (double) sum / numbers.length;
        System.out.println("The Average is " + average);
    }

    public static void exe7() {
        // copy elements from one array to another[5,10,15]
        // declare and  initialize an array
        System.out.println("EXERCISE 7");
        int[] originalNumbers = {5, 10, 15};
        int[] copiedNumbers = new int[originalNumbers.length];
        System.arraycopy(originalNumbers, 0, copiedNumbers, 0, originalNumbers.length);
        for (int copiedNumber : copiedNumbers) {
            System.out.print(copiedNumber + " ");
        }
    }

    public static void exe8() {
        /* search for a specific number in an array [3,7,9,15]
         * target [7]
         */
        //declare and initialise your array
        System.out.println("\nEXERCISE 8");
        int[] numbers = {3, 7, 9, 19};
        //declare target to search
        int target = 7;
        boolean found = false;
        //loop through the array to search
        for (int number : numbers) {
            if (number == target) {
                found = true;
                break;
            }
        }
        System.out.println(found ? " Element found " : "Element not found");

    }

    public static void exe9() {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i += 2) {
            sum += numbers[i];

        }
        System.out.println("EXERCISE 9");
        System.out.println("The sum of even-index is : " + sum);
    }

    public static void exe10() {
        // find duplicate elements in an array [1,2,3,1,4,5,2]
        int[] numbers = {1, 2, 3, 1, 4, 5, 2};
        System.out.println("EXERCISE 10");
        System.out.print("Duplicated numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.print(numbers[i] + " ");
                    break;
                }
            }
        }

    }

}

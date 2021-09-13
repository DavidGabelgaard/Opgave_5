package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //Task 5.1

        int test = 11;

        if (test > 0 && test < 10) {
            System.out.println("positive single digit number.");
        }

        // Task 5.2

        Random random = new Random();

        int RandomNumber = random.nextInt(50) + 1;

        System.out.println("Guess a random number between 1 and 50");

        Scanner Input = new Scanner(System.in);


        for (int i = 0; i < 3; i++) {

            int Guess = Input.nextInt();

            if (RandomNumber != Guess) {
                if (Guess > RandomNumber) {
                    System.out.println("Your guess is to high");
                } else {
                    System.out.println("Your guess is to low");
                }
            } else {
                System.out.println("Congrats you guessed right!");
                break;
            }
            if (i == 2) {
                System.out.println("You ran out of guesses sorry the correct number was: " + RandomNumber);
            }
        }

        // Task 5.3


        Fermat(32, 2, 5, 3);


        /*
        Expression	Result
    yes == no || grade > amount	                    True
    amount == 40.0 || 50.0                          Error
    hiVal != loVal || loVal < 0                     True
    True || hello.length() > 0                      True
    hello.isEmpty() && yes                          False
    grade <= 100 && !false                          True
    !yes || no                                      False
    grade > 75 > amount                             Error
    amount <= hiVal && amount >= loVal              True
    no && !no || yes && !yes                        False or Error
         */


        //Task 5.5
        /* The output is:

        true
        true
        ping
        pong
       */


        //task 5.6


        Quadratic();


        // task 5.7

        Triangle();


    }     // Main

    public static void Fermat(int a, int b, int c, int n) {

        if (n > 2 && Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn’t work.");
        }


    }


    public static void Triangle () {

        double a = 0;
        double b = 0;
        double c = 0;


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers for \"a\", \"b\", \"c\" to see if a triangle can be formed with the lengths ");

        for (int i = 0; i < 3; i++) {
            if (!input.hasNextDouble()) {
                String word = input.next();
                System.err.println(word + " is not a number!");
                return;
            }
                switch (i) {
                    case 0 -> {
                        a = input.nextDouble();
                        if (a <= 0) {
                            return;
                        }
                    }
                    case 1 -> {
                        b = input.nextDouble();
                        if (b <= 0) {
                            return;
                        }
                    }
                    case 2 -> {
                        c = input.nextDouble();
                        if (c <= 0) {
                            return;
                        }
                    }
                }


        }

        if (a > (b+c) || b > (a+c) || c > (a+b) ) {
            System.out.println("The 3 side does not make a triangle");
        } else {
            System.out.println("The 3 sides do make a triangle ");
        }


    }




    public static void Quadratic() {

        double a = 0;
        double b = 0;
        double c = 0;



        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numbers for \"a\", \"b\", \"c\" ");

        for (int i = 0; i < 3; i++) {

            if (!input.hasNextDouble()) {
                String word = input.next();
                System.err.println(word + " is not a number!");
                return;
            }

            switch (i) {
                case 0:
                    a = input.nextDouble();
                    if (a == 0) {
                        System.err.println("a cannot be 0!");
                        return;
                    }
                    break;
                case 1:
                    b = input.nextDouble();
                    if (b < 0 ) {
                        System.err.println("b cannot be a negative number");
                        return;
                    }
                    break;
                case 2:
                    c = input.nextDouble();
                    break;


            }
        }


        final double a1 = (Math.pow(b, 2)) - 4 * a * c;

        double output1 = (-b + (Math.sqrt(a1))  ) / (2*a) ;
        double output2 =(-b - (Math.sqrt(a1))  ) / (2*a) ;

        if (output1 != output2) {
            System.out.println("x = " + output1);
            System.out.println("x = " + output2);
        } else {
            System.out.println("x = " + output1);
        }




    }

}



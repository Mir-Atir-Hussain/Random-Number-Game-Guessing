/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.internship_project;

/**
 *
 * @author mir atir hussain
 */

    import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        int rounds = 0;
        int totalScore = 0;
        String playAgain;
        
        System.out.println("Welcome to the Guessing Game!");
        
        do {
            int numberToGuess = r.nextInt(100) + 1; 
            int attempts = 0;
            boolean hasWon = false;
            int maxAttempts = 5;
            
            System.out.println("\nRound " + (rounds + 1) + ": Try to guess the number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts.");

            
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You've guessed the correct number.");
                    hasWon = true;
                    break;
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }
                
                System.out.println("Attempts remaining: " + (maxAttempts - attempts));
            }

           
            if (hasWon) {
                totalScore += (maxAttempts - attempts + 1); // Higher score for fewer attempts
            } else {
                System.out.println("You've used all attempts. The correct number was " + numberToGuess);
            }
            
            rounds++;
            System.out.println("Your current score: " + totalScore);
            
            
            System.out.print("Would you like to play another round? (yes/no): ");
            playAgain = sc.next();
            
        } while (playAgain.equalsIgnoreCase("yes"));
        
       
        System.out.println("\nGame Over!");
        System.out.println("Total rounds played: " + rounds);
        System.out.println("Your final score: " + totalScore);
        
        sc.close();
    }
}


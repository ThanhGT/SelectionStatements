/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class4Exercise;

/**
 * Class 4-4 Exercise Problem 4
 * Generate a random number between 1 and 500 and check it's divisibility of 5 and 6
 * Author: Thanh Tran
 * Date: September 26, 2018
 */

public class Divisibility {
    
    public static void main (String[] args ) {
        
        int rand = (int)(Math.random() * 500 + 1);  // declare number that will be generated randomly and randomize the numbers between 1 and 500
          
            System.out.println ("Is " + rand + " divisible by 5 and 6? " + (rand%5 == 0 && rand%6 == 0));
            System.out.println ("Is " + rand + " divisible by 5 and 6? " + (rand%5 == 0 || rand%6 == 0));
            System.out.println ("Is " + rand + " divisible by 5 or 6? Not both? " + (rand%5 == 0 ^ rand%6 == 0));
    }
}

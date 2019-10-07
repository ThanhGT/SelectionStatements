/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class4Exercise;

import java.lang.Math;
import java.util.Scanner;

/**
 * Class 4-3 Exercise Problem 3
 * Generate a random number between 1 and 7 and state the corresponding weekday
 * Author: Thanh Tran
 * Date: September 26, 2018
 */

public class SwitchStatement {
 
    public static void main (String[] args) {
        
        // randomly generates a random number from 1 to 7
        int rand = (int)(Math.random() * 7 + 1);
        
        //display to the user what random number was generated
        System.out.println ("The random number generated: " + rand);
        
        switch (rand) {
        
            case 1: System.out.println("Weekend corresponding to " + rand + " is Sunday");
            break;
            case 2: System.out.println("Weekday corresponding to " + rand + " is Monday");
            break;
            case 3: System.out.println("Weekday corresponding to " + rand + " is Tuesday");
            break;
            case 4: System.out.println("Weekday corresponding to " + rand + " is Wednesday");
            break;
            case 5: System.out.println ("Weekday corresponding to " + rand + " is Thursday");
            break;
            case 6: System.out.println ("Weekday corrresponding to " + rand + " is Friday");
            break;
            case 7: System.out.println ("Weekend correspponding to " + rand + " is Saturday");
            break;
            default: System.out.println ("Error: The number generated is out of range");
        }
    }
}

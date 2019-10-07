/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class4Exercise;

import java.lang.Math;
import java.util.Scanner;

/**
 * Class 4-2 Exercise Problem 2
 * Calculate the discriminant and output the # of roots
 * Author: Thanh Tran
 * Date: September 24, 2018
 */

public class DiscriminantCalculation {
    
   public static void main(String[] args) {
       
       // declare variables
       double a;    // declare coefficient a
       double b;    // declare coefficient b
       double c;    // declare coefficient c
       double disc; // declare discriminant
       double root1;    // declare first root by addition
       double root2;    // declare second root by subtraction
       
    // use scanner input
    Scanner input = new Scanner(System.in);
    // prompt user to enter a value for coefficient a
    System.out.println ("Please enter a value for a");
    a = input.nextDouble();
    
    // prompt user to enter a value for coefficient b
    System.out.println ("Please enter a value for b");
    b = input.nextDouble();
    
    // prompt user to enter a value for coefficient c
    System.out.println ("Please enter a value for c");
    c = input.nextDouble();
    
    // calculated discriminant
    disc = Math.pow (b, 2) - 4*a*c;
    
    // list of cases 
    if (disc == 0 ){
        root1 = - b/(2*a);
        System.out.println ("There is only 1 root:" + root1);
    }
    else if (disc < 0) {
        System.out.println ("Theres no real root");
    }
    else if (disc > 0) {
        root1 = (-b + Math.sqrt (disc))/(2*a);
        root2 = (-b - Math.sqrt (disc))/(2*a);
        System.out.println ("Root1: " + root1);
        System.out.println ("Root2: " + root2);
        
   }    //end of if statements 
   }
}

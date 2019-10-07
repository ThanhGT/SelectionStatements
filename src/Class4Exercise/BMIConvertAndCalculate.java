/*
 * 
 */
package Class4Exercise;

import java.util.Scanner;

/**
 * Class 2-3 Exercise Problem 3
 * Display to the user on the status of their BMI
 * Author: Thanh Tran
 * Date: September 10, 2018
 */

public class BMIConvertAndCalculate {

    /**
     * Class 4-1 Exercise Problem 1 
     * Ask user for weight and height in pounds and inches as you convert it to calculate BMI in kg/M. 
     * Thanh Tran
     * September 24, 2018
    */
    
    public static void main(String[] args) {

    double weight;
    double weightKg;
    double height;
    double heightM;
    double bMI;
    
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your weight in pounds");
    weight = input.nextDouble();
   
    weightKg = weight * 0.45359237;
    
    System.out.println("The weight in kilograms is:" + weightKg);
    
    System.out.println("Please enter your height in inches");
    height = input.nextDouble();
    
    heightM = height * 0.0254;
    
    System.out.println ("The height in meters is:" + heightM);
    
    bMI = weightKg / (heightM * heightM);
    
    if (bMI < 18.5) {
    System.out.println("Uh-Oh! Your BMI is " + bMI + ". Looks like you may be underweight!");
    } 
    else if (bMI >= 18.5 && bMI <25.0){
        System.out.println("BMI is" + bMI+ ". That's pretty Average!"); 
    } 
    else if (bMI >= 25.0 && bMI< 30.0) {
        System.out.println ("BMI is " + bMI + ". Maybe it's time to get some exercise as it seems like you are Overweight!");
    }
    else if (bMI <= 30.0) {
        System.out.println ("BMI is " + bMI + ". Might want to check yourself. You are Obese!");
    }
  }
}

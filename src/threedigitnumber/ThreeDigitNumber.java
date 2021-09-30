/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threedigitnumber;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Angelina
 */
public class ThreeDigitNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the three digit integer number: ");
        int num = sc.nextInt();
        
        if (num>99 && num<1000) {
        int ones = (num % 10);
        int tens = ((Math.floorDiv(num, 10)) % 10);
        int hundreds = (Math.floorDiv(num, 100));
        int sum = ones + tens + hundreds;
        System.out.print("The ones: " + ones + "\n");
        System.out.print("The tens: " + tens + "\n");
        System.out.print("The digit sum: " + sum + "\n");
        } 
        else {
            System.out.print("The number is not the three digit number. \n");
        }
    
}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SA2_Q2;

import java.util.Scanner;

/**
 *
 * @author TRUTH
 */
public class SimpleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IllegalArgumentException {
        // TODO code application logic here\
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.print("Please input a number: ");
            int num1 = Integer.parseInt(sc.nextLine());
            
            if(num1 > 100) throw new IllegalArgumentException();
            
            System.out.print("Please input another number: ");
            int num2 = Integer.parseInt(sc.nextLine());
            
            if(num2 > 100) throw new IllegalArgumentException();
            
            int sum = num1 + num2;
            System.out.printf("The sum of the two numbers is %d.%n", sum);
        }
        catch(IllegalArgumentException e){
            System.out.println("Illegal Argument Exception");
        }
        catch(NumberFormatException e){
            System.out.println("Number Format Exception");
        }
    }
    
}

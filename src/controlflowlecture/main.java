/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlflowlecture;

import java.util.Scanner;

/**
 *
 * @author TRUTH
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Imput your name: ");
        String name = scan.nextLine();
        System.out.print("Imput your age: ");
        int age = scan.nextInt();
        System.out.print("Imput your money: ");
        double money = scan.nextDouble();
        System.out.printf("Hi, my name is %s. I am %4d years old. I have %.2f pesos in my pocket.%n", name, age, money);
    }
    
}

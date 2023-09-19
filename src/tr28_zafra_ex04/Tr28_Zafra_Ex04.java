/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tr28_zafra_ex04;

import java.util.Scanner;

/**
 *
 * @author TRUTH
 */
public class Tr28_Zafra_Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        Move rock = new Move("Rock");
        Move paper = new Move("Paper");
        Move scissors = new Move("Scissors");

        rock.setStrongAgainst(scissors);
        paper.setStrongAgainst(rock);
        scissors.setStrongAgainst(paper);

        int roundsToWin = 2, option, playerW, computerW;
        Move playerM = null, computerM = null;
        boolean runApplication = true, firstRun = true;
        
        while(runApplication) {
            playerW = computerW = 0;
            
            System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:");
            System.out.println("1. Start game");
            System.out.println("2. Change number of rounds");
            System.out.println("3. Exit application");
            option = sc.nextInt();
            
            switch(option){
                case 1:
                    System.out.println("\r\nThis match will be first to " + roundsToWin + " wins.");
                    
                    while(true) {
                        if(playerW == roundsToWin || computerW == roundsToWin){
                            break;
                        }
                        
                        System.out.println("The computer has selected its move. Select your move: ");
                        System.out.println("1. Rock");
                        System.out.println("2. Paper");
                        System.out.println("3. Scissors");
                        option = sc.nextInt();
                        
                        firstRun = false;
                        int random = (int) Math.floor(Math.random()*3) + 1;

                        switch(random){
                            case 1:
                                computerM = rock;
                                break;
                            case 2:
                                computerM = paper;
                                break;
                            case 3:
                                computerM = scissors;
                                break;
                        }
                        switch(option){
                            case 1:
                                playerM = rock;
                                break;
                            case 2:
                                playerM = paper;
                                break;
                            case 3:
                                playerM = scissors;
                                break;
                        }

                        switch(Move.compareMoves(playerM, computerM)){
                            case 0:
                                System.out.print("\r\nPlayer chose " + playerM.getName() + ". Computer chose ");
                                System.out.println(computerM.getName() + ". Player wins round! ");
                                playerW++;
                                break;
                            case 1:
                                System.out.print("\r\nPlayer chose " + playerM.getName() + ". Computer chose ");
                                System.out.println(computerM.getName() + ". Computer wins round! ");
                                computerW++;
                                break;
                            case 2:
                                System.out.print("\r\nPlayer chose " + playerM.getName() + ". Computer chose ");
                                System.out.println(computerM.getName() + ". Round is tied! ");
                                break;
                        }
                        
                        System.out.println("Player: " + playerW + " - Computer: " + computerW + "\r\n");
                    } 
                    if(playerW == roundsToWin) {
                        System.out.println("Player wins!\r\n");
                    }
                    else{
                        System.out.println("Computer wins!\r\n");
                    }
                    
                    break;
                case 2:
                    System.out.println("\nHow many wins are needed to win a match?");
                    roundsToWin = sc.nextInt();
                    
                    System.out.println("\nNew settings has been saved!");
                    break;
                case 3:
                    System.out.println("\nThank you for playing!");
                    runApplication = false;
                    break;
            }
        }

    }
    
}

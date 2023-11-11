/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tr28_zafra_ex02;

/**
 *
 * @author TRUTH
 */
public class Character {
    String name;
    int attackStat;
    char tier;
    int tierEquivalent;
    
    Character(String name, int attackStat, char tier) {
        this.name = name;
        this.attackStat = attackStat;
        this.tier = tier;
        
        switch(this.tier){
            case 'S':
                this.tierEquivalent = 6;
                break;
            case 'A':
                this.tierEquivalent = 5;
                break;
            case 'B':
                this.tierEquivalent = 4;
                break;
            case 'C':
                this.tierEquivalent = 3;
                break;
            case 'D':
                this.tierEquivalent = 2;
                break;
            case 'E':
                this.tierEquivalent = 1;
            case 'F':
                this.tierEquivalent = 0;
        }
    }
}

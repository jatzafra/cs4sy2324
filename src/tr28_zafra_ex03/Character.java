/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tr28_zafra_ex03;

/**
 *
 * @author TRUTH
 */
public class Character {
    private String name;
    private int attackStat;
    private char tier;
    private int tierEquivalent;
    
    public Character(String n, int as, char t) {
        name = n;
        attackStat = as;
        tier = t;
        
        switch(this.tier){
            case 'S':
                tierEquivalent = 6;
                break;
            case 'A':
                tierEquivalent = 5;
                break;
            case 'B':
                tierEquivalent = 4;
                break;
            case 'C':
                tierEquivalent = 3;
                break;
            case 'D':
                tierEquivalent = 2;
                break;
            case 'E':
                tierEquivalent = 1;
                break;
            case 'F':
                tierEquivalent = 0;
        }
    }
    public String getName(){
        return name;
    }
    public int getAttackStat(){
        return attackStat;
    }
    public char getTier(){
        return tier;
    }
    public int getTierEquivalent(){
        return tierEquivalent;
    }
    public void setName(String n){
        name = n;
    }
    public void setAttackStat(int a){
        attackStat = a;
    }
    public void setTier(char t){
        tier = t;
    }
    public void setTierEquivalent(int te){
        tierEquivalent = te;
    }
}

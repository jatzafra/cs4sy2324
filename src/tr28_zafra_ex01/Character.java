/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr28_zafra_ex01;

/**
 *
 * @author TRUTH
 */
public class Character {
    String name;
    int attackStat;
    char tier;
    
    Character(String name, int attackStat, char tier) {
        this.name = name;
        this.attackStat = attackStat;
        this.tier = tier;
    }
}

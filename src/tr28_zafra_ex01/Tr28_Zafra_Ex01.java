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
public class Tr28_Zafra_Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        Character Ayaka = new Character("Ayaka", 342, 'S');
        Character Eula = new Character("Eula", 342, 'F');
        Character Ganyu = new Character("Ganyu", 335, 'B');
        
        System.out.println("Name: " + Ayaka.name);
        System.out.println("Attack Stat: " + Ayaka.attackStat);
        System.out.println("Tier: " + Ayaka.tier);
        
        System.out.println("Name: " + Eula.name);
        System.out.println("Attack Stat: " + Eula.attackStat);
        System.out.println("Tier: " + Eula.tier);
        
        System.out.println("Name: " + Ganyu.name);
        System.out.println("Attack Stat: " + Ganyu.attackStat);
        System.out.println("Tier: " + Ganyu.tier);
    }
    
}

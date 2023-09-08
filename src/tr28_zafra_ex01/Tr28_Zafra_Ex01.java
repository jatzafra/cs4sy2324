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
        Character ayaka = new Character("Ayaka", 342, 'S');
        Character eula = new Character("Eula", 342, 'F');
        Character ganyu = new Character("Ganyu", 335, 'B');
        
        System.out.println("Name: " + ayaka.name);
        System.out.println("Attack Stat: " + ayaka.attackStat);
        System.out.println("Tier: " + ayaka.tier + "\r\n");
        System.out.println("Name: " + eula.name);
        System.out.println("Attack Stat: " + eula.attackStat);
        System.out.println("Tier: " + eula.tier + "\r\n");
        System.out.println("Name: " + ganyu.name);
        System.out.println("Attack Stat: " + ganyu.attackStat);
        System.out.println("Tier: " + ganyu.tier + "\r\n");
        
        System.out.println("Total attack stat: " + (ayaka.attackStat + eula.attackStat + ganyu.attackStat));
        System.out.println("Ayaka and Eula have the same attack stat: " + (ayaka.attackStat == eula.attackStat));
        System.out.println("Eula has a higher tier than Ayaka: " + (eula.tierEquivalent > ayaka.tierEquivalent));
    }
    
}
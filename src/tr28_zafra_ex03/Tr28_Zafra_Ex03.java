/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tr28_zafra_ex03;

/**
 *
 * @author Lenovo
 */
public class Tr28_Zafra_Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Song moonlikeSmile = new Song("Moonlike Smile");
        Song inevitableConflict = new Song("Inevitable Conflict");
        Song irresistibleForce = new Song("Irresistible Force");
        
        Singer yuPengChen = new Singer("Yu-Peng Chen", 0, 0, moonlikeSmile);
        Singer yijunJiang = new Singer("Yijun Jiang", 0, 0, irresistibleForce);
        
        yuPengChen.performForAudience(15, yijunJiang);
        
        System.out.println("\r\nName: " + yuPengChen.getName());
        System.out.println("No. of Performances: " + yuPengChen.getNoOfPerformances());
        System.out.println("Earnings: " + yuPengChen.getEarnings());
        System.out.println("Favorite Song: " + yuPengChen.getFavoriteSong().getTitle());
        System.out.println("Total No. of Performances: " + Singer.getTotalPerformances());
        
        System.out.println("\r\nName: " + yijunJiang.getName());
        System.out.println("No. of Performances: " + yijunJiang.getNoOfPerformances());
        System.out.println("Earnings: " + yijunJiang.getEarnings());
        System.out.println("Favorite Song: " + yijunJiang.getFavoriteSong().getTitle());
        System.out.println("Total No. of Performances: " + Singer.getTotalPerformances());
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tr28_zafra_ex02;

/**
 *
 * @author TRUTH
 */
public class Tr28_Zafra_Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Song moonlikeSmile = new Song("Moonlike Smile");
        Song inevitableConflict = new Song("Inevitable Conflict");
        
        Singer yuPengChen = new Singer("Yu-Peng Chen", 0, 0, moonlikeSmile);
        
        System.out.println("\r\nName: " + yuPengChen.name);
        System.out.println("No. of Performances: " + yuPengChen.noOfPerformances);
        System.out.println("Earnings: " + yuPengChen.earnings);
        System.out.println("Favorite Song: " + yuPengChen.favoriteSong.title + "\r\n");
        
        yuPengChen.performForAudience(12);
        System.out.println("\r\nName: " + yuPengChen.name);
        System.out.println("No. of Performances: " + yuPengChen.noOfPerformances);
        System.out.println("Earnings: " + yuPengChen.earnings);
        System.out.println("Favorite Song: " + yuPengChen.favoriteSong.title + "\r\n");
        
        yuPengChen.changeFavSong(inevitableConflict);
        System.out.println("\r\nName: " + yuPengChen.name);
        System.out.println("No. of Performances: " + yuPengChen.noOfPerformances);
        System.out.println("Earnings: " + yuPengChen.earnings);
        System.out.println("Favorite Song: " + yuPengChen.favoriteSong.title + "\r\n");
        
        
    }
    
}

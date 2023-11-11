/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tr28_zafra_ex02;

/**
 *
 * @author TRUTH
 */
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    
    Singer(String name, int perform, double earn, Song favorite){
        this.name = name;
        this.noOfPerformances = perform;
        this.earnings = earn;
        this.favoriteSong = favorite;
    }
    public void performForAudience(int n){
        noOfPerformances++;
        earnings += n*100;
        System.out.println(this.name + " performs for an audience of " + n);
    }
    public void changeFavSong(Song favorite){
        favoriteSong = favorite;
        System.out.println(this.name + " changes their favorite song to " + this.favoriteSong.title);
    }
}

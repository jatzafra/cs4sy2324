/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tr28_zafra_ex03;

/**
 *
 * @author TRUTH
 */
public class Singer {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    private static int totalPerformances = 0;
    
    public Singer(String n, int perform, double earn, Song favorite){
        name = n;
        noOfPerformances = perform;
        earnings = earn;
        favoriteSong = favorite;
    }
    public String getName(){
        return name;
    }
    public int getNoOfPerformances(){
        return noOfPerformances;
    }
    public double getEarnings(){
        return earnings;
    }
    public Song getFavoriteSong(){
        return favoriteSong;
    }
    public static int getTotalPerformances(){
        return totalPerformances;
    }
    public void performForAudience(int n){
        totalPerformances++;
        noOfPerformances++;
        earnings += n*100;
        System.out.println(name + " performs for an audience of " + n);
    }
    public void performForAudience(int n, Singer otherSinger){
        totalPerformances++;
        this.noOfPerformances++;
        this.earnings += n*50;
        otherSinger.noOfPerformances++;
        otherSinger.earnings += n*50;
        System.out.println(this.name + " with " + otherSinger.name + " performs for an audience of " + n);
    }
    public void changeFavSong(Song favorite){
        favoriteSong = favorite;
        System.out.println(name + " changes their favorite song to " + favoriteSong.getTitle());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sa2truthzafrajulian;

/**
 *
 * @author TRUTH
 */
public class Tutor {
    // Create a Tutor class [10pts]
    // Give the Tutor class fields for name (String), rate (double), earnings (double), specialization (String) (2pts)
    private String name, specialization;
    private double rate, earnings;
    
    // Make a constructor for the Tutor class that has parameters for name, rate and specialization, and sets the earnings to 0 (3pts)
    public Tutor(String n, double r, String s){
        this.name = n;
        this.rate = r;
        this.specialization = s;
        this.earnings = 0;
    }
    
    // Write the following methods:
    // 	-getter/accessor methods for all fields (3pts)
    public String getName(){
        return name;
    }
    public double getRate(){
        return rate;
    }
    public String getSpecialization(){
        return specialization;
    }
    public double getEarnings(){
        return earnings;
    }
    
    //	-addEarnings(): adds the rate to the earnings (2pts)
    public void addEarnings(){
        earnings += rate;
    }
}

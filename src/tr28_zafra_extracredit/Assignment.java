/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tr28_zafra_extracredit;

/**
 *
 * @author TRUTH
 */
public class Assignment {
    private final String name;
    private final double timeAlloted;
    
    public Assignment(String name, double time){
        this.name = name;
        this.timeAlloted = time;
    }
    
    public String getName(){
        return name;
    }
    public double getTimeAlloted(){
        return timeAlloted;
    }
}

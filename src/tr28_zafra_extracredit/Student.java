/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tr28_zafra_extracredit;

import java.util.ArrayList;

/**
 *
 * @author TRUTH
 */
public class Student {
    private final String name;
    private ArrayList<Assignment> assignments;
    
    public Student(String name){
        this.name = name;
        this.assignments = new ArrayList();
    }
    
    public String getName(){
        return name;
    }
    public ArrayList<Assignment> getAssignments(){
        return assignments;
    }
    public void addAssignment(Assignment a){
        assignments.add(a);
    }
    public void finishAssignment(Assignment a){
        assignments.remove(a);
    }
    public double getTimeNeeded(){
        double totalTime = 0;
        for(Assignment assi : assignments){
            totalTime += assi.getTimeAlloted();
        }
        
        return totalTime;
    }
}

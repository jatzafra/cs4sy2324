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
public class Teacher {
    private String name;
    private String subject;
    private ArrayList<Section> sections;
    
    public Teacher(String name, String subj){
        this.name = name;
        this.subject = subj;
        this.sections = new ArrayList();
    }
    
    public void addSection(Section s){
        sections.add(s);
    }
    public void giveAssignment(Assignment a){
        for(Section s : sections){
            for(Student stud : s.)
        }
    }
}

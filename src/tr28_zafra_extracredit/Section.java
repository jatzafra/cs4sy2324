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
public class Section {
    private final String name;
    private ArrayList<Student> students;
    
    public Section(String name){
        this.name = name;
        this.students = new ArrayList();
    }
    
    public String getName(){
        return name;
    }
    public ArrayList<Student> getStudents(){
        return students;
    }
    public void addStudent(Student s){
        students.add(s);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tr28_zafra_extracredit;

/**
 *
 * @author TRUTH
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Teacher t1 = new Teacher("John", "Math");
        Teacher t2 = new Teacher("Jane", "English");
        Teacher t3 = new Teacher("Juan", "Filipino");
        
        Section c1 = new Section("Charm");
        Section c2 = new Section("Truth");
        
        Student s1 = new Student("Charlie");
        Student s2 = new Student("Oscar");
        Student s3 = new Student("Victor");
        
        Assignment a1 = new Assignment("Problem Set", 2);
        Assignment a2 = new Assignment("Groupwork", 3);
        Assignment a3 = new Assignment("Research", 5);
        
        t1.addSection(c1);
        t1.addSection(c2);
        t2.addSection(c2);
        t3.addSection(c1);
        
        c1.addStudent(s1);
        c1.addStudent(s2);
        c2.addStudent(s3);
        
        t1.giveAssignment(a1);
        t2.giveAssignment(a2);
        t3.giveAssignment(a3);
        s2.finishAssignment(a1);
        System.out.printf("%s remaining work: %.2f%n", s1.getName(), s1.getTimeNeeded());
        System.out.printf("%s remaining work: %.2f%n", s2.getName(), s2.getTimeNeeded());
        System.out.printf("%s remaining work: %.2f%n", s3.getName(), s3.getTimeNeeded());
    }
    
}

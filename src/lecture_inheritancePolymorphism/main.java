/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lecture_inheritancePolymorphism;

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
        Student m = new Student("Mark", 60, 10, "Truth");
        Teacher n = new Teacher("Nathan", "AdTech");
        System.out.println(m.getAge());
        System.out.println(m.getMoney());
        m.earnMoney(500);
        System.out.println(m.getMoney());
        m.introduce();
        n.introduce();
    }
    
}

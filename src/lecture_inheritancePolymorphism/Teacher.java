/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecture_inheritancePolymorphism;

/**
 *
 * @author TRUTH
 */
public class Teacher extends Person{
    private String subject;
    private double hourlyWage;
    
    public Teacher(String name, String subject, double hourlyWage){
        super(name);
        this.subject = subject;
        this.hourlyWage = hourlyWage;
    }
    public Teacher(String name, String subject){
        super(name);
        this.subject = subject;
        this.hourlyWage = 500;
    }
    public void teach(){
        this.money += hourlyWage;
    }
    @Override
    public void introduce(){
        super.introduce();
        System.out.printf("I teach %s.\n", subject);
    }
}

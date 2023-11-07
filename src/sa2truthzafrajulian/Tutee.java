/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sa2truthzafrajulian;

/**
 *
 * @author TRUTH
 */
public class Tutee {
    // Debug the Tutee class [20pts]
    // Give the Tutee class fields for name (String), money (double), subject (String), grade (double), and totalTutorialSessions (int, static, set to 0) (3pts)
    // Make 2 constructors for the Tutee class that
    // 	-has parameters for the name, money, and sets the subject to "Math" and grade to 60 (2pts)
    // 	-has parameters for the name, money, subject, and grade (2pts)
    private String name, subject;
    private double money, grade;
    private static int totalTutorialSessions = 0;

    public Tutee(String n, double m){
            name = n;
            money = m;
            subject = "Math";
            grade = 60;
    }
    public Tutee(String n, double m, String s, double g){
            name = n;
            money = m;
            subject = s;
            grade = g;
    }

    // Write the following methods:
    // 	-getter/accessor methods for all fields (2pts)    
    public String getName(){
        return name;
    }
    public double getMoney(){
        return money;
    }
    public String getSubject(){
        return subject;
    }
    public double getGrade(){
        return grade;
    }
    public static int getTotalTutorialSessions(){
        return totalTutorialSessions;
    }
    // 	-consult(Tutor t): 
    // 		*given a Tutor, check the rate and if the Tutee has enough money, the consultation proceeds. (2pts)
    //			>Print "<Tutee's name> doesn't have enough money to have a consultation with <doctor's name>." if Tutee doesn't have enough money (1pt)
    //		*the money of the Tutee is reduced by the rate of the Tutor and added to the Tutor's earnings and the totalTutorialSessions is increased by 1 (2pts)
    // 		*if the Tutor's specialization is the same as the Tutee's subject, the Tutee's grade is increased by 3. It is increased by 1 otherwise. (2pts)
    // 			>Print "<tutor's name> helped <Tutee's name> a little." if specialization doesn't match condition (2pt)
    // 			>Print "<tutor's name> helped <Tutee's name> make great progress in <Tutee's subject>." if specialization matches condition (2pt)
    public void consult(Tutor t){
        if(money >= t.getRate()){
            money -= t.getRate();
            t.addEarnings();
            totalTutorialSessions ++;
            if(subject.equals(t.getSpecialization())){
                System.out.printf("%s helped %s make great progress in %s.\n", t.getName(), name, subject);
                grade += 3;
            }
            else{
                System.out.printf("%s helped %s a little.\n", t.getName(), name);
                grade += 1;
            }
        }
        else{
            System.out.println(name + " doesn't have enough money to have a consultation with " + t.getName() + ".");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sa2truthzafrajulian;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author TRUTH
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // Write main method [20pts]
        // Create a Tutee s1 with name "Matthew" and 300 money. (1pt)
        // Create a Tutee s2 with name "John", 2000 money, subject "English", and grade 78 (1pt)
        Tutee s1 = new Tutee("Matthew", 300);
        Tutee s2 = new Tutee("John", 2000, "English", 78);
        
        // Create a Tutor t1 with name "Aaron", rate 500, and "Math" specialization (1pt)
        // Create a Tutor t2 with name "Danica", rate 200, and "Math" specialization (1pt)
        // Create a Tutor t3 with name "Gerson", rate 600, and "English" specialization (1pt)
        Tutor t1 = new Tutor("Aaron", 500, "Math");
        Tutor t2 = new Tutor("Danica", 200, "Math");
        Tutor t3 = new Tutor("Gerson", 600, "English");
        
        // Create an ArrayList of Tutee tuteeList and add s1 and s2 (1pts)
        ArrayList<Tutee> tuteeList = new ArrayList();
        tuteeList.add(s1);
        tuteeList.add(s2);
        
        // Create an ArrayList of Tutors tutorList and add t1, t2, and t3 (1pts)
        ArrayList<Tutor> tutorList = new ArrayList();
        tutorList.add(t1);
        tutorList.add(t2);
        tutorList.add(t3);
        
        
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        
        String response = "";
        
        // Write a loop that ends when all Tutees have a grade higher than 80 or the loop has run 5 times (3pts)
        for(int i = 0; i < 5; i++) {
            boolean highGrades = true;
            for(Tutee t : tuteeList){
                if(t.getGrade() <= 80 ){
                    highGrades = false;
                }
            }
            if(highGrades){
                break;
            }
            
            // Inside the loop:
            //	-Ask the user which Tutee will be selected (3pts)
            //		>Print "No Tutee named <input> is listed." if user input doesn't match (1pt)
            System.out.println("Select a tutee: ");
            response = br.readLine();
            
            Tutee selectedTutee = null;
            for(Tutee t : tuteeList){
                if(response.equals(t.getName())){
                    selectedTutee = t;
                    break;
                }
            }
            
            if (selectedTutee == null){
                System.out.println("No Tutee named " + response + " is listed.");
            }
            else{
                //	-Ask the user which tutor will be hired by the Tutee (3pts)
                //		>Print "No tutor named <input> is listed." if user input doesn't match (1pt)
                System.out.println("Select a tutor: ");
                response = br.readLine();
                
                Tutor selectedTutor = null;
                for(Tutor t : tutorList){
                    if(response.equals(t.getName())){
                        selectedTutor = t;
                        break;
                    }
                }
                
                if(selectedTutor == null){
                    System.out.println("No tutor named " + response + " is listed.");
                }
                else{
                    //	-Selected Tutee consults with selected tutor using the information given (1pts)
                    selectedTutee.consult(selectedTutor);
                }
            }
        }
        
        // When the loop ends, display the number of consultations that occurred (1pt)
        System.out.println("Total tutorials: " + Tutee.getTotalTutorialSessions());
    }
    
}

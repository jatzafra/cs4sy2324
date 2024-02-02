/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise11truthzafrajulian;

import javax.swing.*;
import java.awt.*;



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
        JFrame window = new JFrame("Subject Simulator");
        
        Subject math = new Subject("Math", "math.png", 4, 1.75);
        Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
        Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
        Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
        Subject cs = new Subject("CS", "computer science.png", 1, 1.5);
        
        Subject displayedSubject = math;
        
        JLabel name = new JLabel(displayedSubject.getName());
        ImageIcon logo = new ImageIcon(main.class.getResource(displayedSubject.getImgFileName()));
        JLabel img = new JLabel();
        img.setIcon(logo);
        JLabel units = new JLabel(Double.toString(displayedSubject.getUnits()));
        JLabel grade = new JLabel(Double.toString(displayedSubject.getGrade()));
        
        
        window.add(name);
        window.add(img);
        window.add(units);
        window.add(grade);
        
        window.setVisible(true);
    }
    
}

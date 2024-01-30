/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUI_Lecture;

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
        JLabel text = new JLabel("Testicle");
        JLabel img = new JLabel();
        JButton btn = new JButton("Click me");
        JFrame window = new JFrame("Sample Swing");
        FlowLayout layout = new FlowLayout(FlowLayout.CENTER, 30, 10);
        
        ImageIcon img = new ImageIcon(main.class.getResource("filename"));
        
        window.setLayout(layout);
        window.add(text);
        window.add(btn);
        
        
    }
    
}

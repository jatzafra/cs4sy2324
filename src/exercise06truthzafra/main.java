/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise06truthzafra;

/**
 *
 * @author Lenovo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FireType incineroar = new FireType("Incineroar", 50, 20);
        WaterType primarina = new WaterType("Primarina", 44, 25);
        GrassType decidueye = new GrassType("Decidueye", 70, 30);
        
        while(primarina.getHP() > 0 && decidueye.getHP() > 0){
            primarina.attack(decidueye);
            decidueye.attack(primarina);
        }
    }
    
}

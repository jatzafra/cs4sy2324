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
        
        //grass vs fire
        while(decidueye.getHP() > 0 && incineroar.getHP() > 0){
            decidueye.attack(incineroar);
            if(!(decidueye.getHP() > 0 && incineroar.getHP() > 0)) break;
            incineroar.attack(decidueye);
        }
        decidueye.resetHealth();
        incineroar.resetHealth();
        
        //fire vs water
        while(incineroar.getHP() > 0 && primarina.getHP() > 0){
            incineroar.attack(primarina);
            if(!(incineroar.getHP() > 0 && primarina.getHP() > 0)) break;
            primarina.attack(incineroar);
        }
        incineroar.resetHealth();
        primarina.resetHealth();
        
        //water vs grass
        while(primarina.getHP() > 0 && decidueye.getHP() > 0){
            primarina.attack(decidueye);
            if(!(primarina.getHP() > 0 && decidueye.getHP() > 0)) break;
            decidueye.attack(primarina);
        }
        primarina.resetHealth();
        decidueye.resetHealth();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise07truthzafrajulian;

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
        FireType incineroar = new FireType("Incineroar", 50, 20);
        WaterType primarina = new WaterType("Primarina", 44, 25);
        GrassType decidueye = new GrassType("Decidueye", 70, 30);
        
        Location pkmncenter = new Location("Pokemon Center", "healing pokemon");
        Location ikitown = new Location("Iki Town", "challenging the grand trial");
        
        NPC nurse = new NPC("Nurse Joy", pkmncenter);
        
        Trainer selene = new Trainer("Selene", ikitown);
        
        selene.inspect(nurse);
        selene.inspect(selene.getCurrentLocation());
        selene.inspect(incineroar);
        
    }
    
}

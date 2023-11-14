/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise07truthzafrajulian;

/**
 *
 * @author TRUTH
 */
public class WaterType extends Monster{
    public WaterType(String n, int m, int base){
        super(n, "water", "fire", "grass", m, base);
        atk *= 0.7;
        def *= 1.3;
    }
    @Override
    public void special(){
        System.out.println(name + " used its special attack.");
        def += 2;
        hp -= 0.1*maxHP;
    }
}

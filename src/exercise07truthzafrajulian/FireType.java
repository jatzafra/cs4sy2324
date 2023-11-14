/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise07truthzafrajulian;

/**
 *
 * @author TRUTH
 */
public class FireType extends Monster{
    public FireType(String n, int m, int base){
        super(n, "fire", "grass", "water", m, base);
        atk *= 1.3;
        def *= 0.7;
    }
    @Override
    public void special(){
        System.out.println(name + " used its special attack.");
        atk += 2;
        hp -= 0.1*maxHP;
    }
}

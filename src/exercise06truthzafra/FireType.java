/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise06truthzafra;

/**
 *
 * @author TRUTH
 */
public class FireType extends Monster{
    public FireType(String n, int m, int base){
        name = n;
        type = "fire";
        strongAgainst = "water";
        weakAgainst = "grass";
        maxHP = m;
        hp = m;
        atk = 1.3 * base;
        def = 0.7 * base;
        xp = 0;
        lvl = 1;
        monsterList.add(this);
        guard = false;
        charge = false;
    }
    @Override
    public void special(){
        System.out.println(name + " ");
        atk += 2;
        hp -= 0.1*maxHP;
    }
}

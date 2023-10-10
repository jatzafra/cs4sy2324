/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecture_array;

/**
 *
 * @author TRUTH
 */
public class Person {
    private String name;
    private int age;
    private double money;
    
    public Person(String name){
        this.name = name;
        this.receipts = "";
        this.expenses = 0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public double getMoney(){
        return this.money;
    }
    
    public static Person getPerson(int index){
        return personlist.get(index);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecture_array;

import java.util.ArrayList;

/**
 *
 * @author TRUTH
 */
public class Person {
    private String name;
    private int age;
    private double money;
    private static ArrayList<Person> personList;
    
    public Person(String name){
        this.name = name;
        this.age = 0;
        this.money = 0;
        this.personList =  new ArrayList();
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
        return personList.get(index);
    }
    public static void addPerson(Person p){
        personList.add(p);
    }
}

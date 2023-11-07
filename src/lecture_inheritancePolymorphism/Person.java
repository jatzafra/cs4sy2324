/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecture_inheritancePolymorphism;

import java.util.ArrayList;

/**
 *
 * @author TRUTH
 */
public class Person {
    protected String name;
    protected int age;
    protected double money;
    protected Person friend;
    protected static Person recentWorker;
    protected static ArrayList<Person> personList = new ArrayList();
    
    public Person(String name){
        this.name = name;
        this.age = 0;
        this.money = 0;
        personList.add(this);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the money
     */
    public double getMoney() {
        return money;
    }

    /**
     * @param money the money to set
     */
    public void setMoney(double money) {
        this.money = money;
    }
    
    public void earnMoney(double earnings){
        money += earnings;
    }
    public void introduce(){
        System.out.printf("Hi, my name is %s.\n", name);
    }
}

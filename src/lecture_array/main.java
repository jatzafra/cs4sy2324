/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lecture_array;

import java.util.ArrayList;

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
        int[] numList = {1,2,3,4}; //can't change size
        String[] stringList = new String[5];
        stringList[0] = "Hello";
        stringList[1] = "Hi";
        stringList[3] = "Hola";
        stringList = new String[10]; //changes stringList
        char[][] charGrid = new char[3][3]; //you can make multi-demnsional arrays
        ArrayList<Person> personList = new ArrayList();
        Person a = new Person("Joe");
        Person b = new Person("Jane");
        personList.add(a);
        personList.add(b);
        System.out.println(Person.getPerson(0));
    }
    
}

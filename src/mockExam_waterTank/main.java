/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mockExam_waterTank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here        
        boolean runProgram = true, stationFound;
        String response;
        double responseInt;
        
        WaterStation selectedStation = null;
        
        WaterTank homeTank = new WaterTank("John", 1000);
        
        WaterStation tap = new WaterStation("Tap", 1.5);
        WaterStation mw = new WaterStation("Manila Water", 8);
        WaterStation maynilad = new WaterStation("Maynilad", 6.5);
        
        ArrayList<WaterStation> stationList = new ArrayList();
        stationList.add(tap);
        stationList.add(mw);
        stationList.add(maynilad);
        
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        while(runProgram && homeTank.getAmountFilled() <= 100){
            System.out.println("Which water station will the tank be filled at (or exit):");
            response = br.readLine();
            
            if(!(response.equals("exit"))){
                stationFound = false;
                for(WaterStation station : stationList){
                    if(response.equals(station.getName())){
                        stationFound = true;
                        selectedStation = station;
                        break;
                    }
                }
                if(stationFound){
                    System.out.println("How much water will the tank be filled by " + selectedStation.getName() + " (In L):");
                    responseInt = Double.parseDouble(br.readLine());
                    
                    homeTank.fill(selectedStation, responseInt);
                }
                else{
                    System.out.println("No such water station called " + response + ".");
                }
            }
            else{
                runProgram = false;
                System.out.println("You have exited the application.");
            }
        }
        homeTank.displayStats();
        
        for(WaterStation station: stationList) {
            station.displayStats();
        }
    }
    
}

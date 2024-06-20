/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment4program2;
//import I/O and input JOptionpane to usein program
import javax.swing.JOptionPane;
import java.io.*;
import java.io.PrintWriter;
/**
 *
 * @author John Hernadez 06/10/24
 */
public class Assignment4program2 
{
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException 
    {
        //Declaring Variables
        int hours;
        int speed;
        int distance;
        String str;
    
        //Input using JOption
        str = JOptionPane.showInputDialog("How fast you going in Miles Per Gallon(MPG)");
        speed = Integer.parseInt(str);
        
        //User Input for loop limit
        str = JOptionPane.showInputDialog("How many hours have you traveled?");
        hours = Integer.parseInt(str);
       
        //Create Variable to input info in files and Opened File 
        PrintWriter outputFile = new PrintWriter("RoadTrip.txt");
  
        //String formating using the \t aslo input in file
        System.out.println("Hours\t\tDistance Traveled");
        outputFile.println("Hours\t\tDistance Traveled");
        
        
        System.out.println("----------------------------------");
        outputFile.println("----------------------------------");
        
        //using for loop to control max hours from user input
        for (int i = 1; i <= hours; i++) 
        {
            //Calculation to update distance in loop
            distance = speed*i;
                
            //Input Validation for both speed and time traveled
            if(speed>=0)
            {
                if(hours>=1)
                {
                        
                    // Int i will Inclement by 1 and adjust distance formula
                    // too a new distance in the next loop around
                    System.out.println(i + "\t\t" + distance);
                        
                    //Collect Println Input for File
                    outputFile.println(i + "\t\t" + distance);
                }
            }
        }
        //Close the file
        outputFile.close();
        System.out.println("Data written to file");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Velocity;

/**
 *
 * @author class
 */
//Fahad Kabir
import java.text.DecimalFormat;
import java.util.Scanner;
public class Test3Program2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner kb = new Scanner(System.in);
        double M;
        double V; 
        
        System.out.print("enter the objects Mass in Kilograms : ");
        M = kb.nextDouble();   
        System.out.print("enter the objects Velocity in meters per second : ");
        V = kb.nextDouble();    
        
        System.out.print("the Kinetic Energy of the Object is " + KineticEnergy(M,V));
       
        
        
    }
    
    public static double KineticEnergy(double M, double V)
    {
        
            return ((1.0/2.0) * ((M * V)*(M * V)));  
    
    }
}

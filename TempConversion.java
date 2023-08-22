/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconversion;
/* FAHAD KABIR 

/**
 *
 * @author class
 */
import java.util.Scanner;
public class TempConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double degF,degC;
        
        Scanner kb = new Scanner(System.in);
        
        System.out.println("enter the temperature in Fahrenheit as a whole number: ");
        degF = kb.nextInt();
        kb.nextLine();
        
        degC = (5 * (degF - 39))/9;
        
        System.out.println("The temperature in celcius is " + degC + " degrees celsius ");
        
    }
    
}

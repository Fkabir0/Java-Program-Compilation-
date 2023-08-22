/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberofseconds;

/**
 *
 * Fahad Kabir
 */ 
import java.util.Scanner;
public class Numberofseconds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        double seconds;
        double minutes;
        double hours;
        double days; 
        
        System.out.println("enter the number of seconds: ");
        seconds = kb.nextDouble();
        
        if (seconds >= 60 && seconds < 3600 ){
            minutes = (seconds/60);
            System.out.print("there are " + minutes + " minutes in " + seconds + " seconds ");
        } else if (seconds >= 3600 && seconds < 86400 ){
            hours = (seconds / 3600);
            System.out.print("there are " + hours + " hours in " + seconds + " seconds ");
        } else if (seconds >= 86400 ){
            days = (seconds / 86400 );
            System.out.print("there are " + days + " days in " + seconds + " seconds ");   
        } else {
            System.out.print("approximately " + seconds + " seconds have passed ");

    
    }   
            
        
    }
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squreroot;

/**
 *
 * @author Bhashitha
 */
import java.util.Scanner;
public class SqureRoot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number=sc.nextDouble();
        
        double squareRoot = Math.sqrt(number);
 
        //Displaying the values
        System.out.println("number : "+number);
        System.out.println("Square Root : "+squareRoot);
    }
    
}

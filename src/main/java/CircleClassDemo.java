
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MichaelRigoOseeBrou
 */
public class CircleClassDemo {
/**
     * The main method
     *
     * @param args
     */
    public static void main(String[] args) {
        //create scanner object to read user input
        Scanner keyboard = new Scanner(System.in);
        double radius;
        //prompt user to enter radius
        System.out.print("Enter the radius of the Circle: ");
        radius = keyboard.nextDouble();

        //create Circle object
        CircleClass circle = new CircleClass(radius);
        //display the area, diameter, and the circumference of the Circle
        System.out.println("The area of the circle is: " + circle.area());
        System.out.println("The diameter of the circle is: " + circle.diameter());
        System.out.println("The circumference of the circle is: " + circle.circumference());
    }    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MichaelRigoOseeBrou
 */
public class CircleClass {

    //declare variables

    private double radius;
    private static final double PI = 3.14159;

    /**
     * Class constructor which accepts the Circle radius
     *
     * @param r circle radius
     */
    public CircleClass(double r) {
        radius = r;
    }

    /**
     * A no-Arg class constructor that sets the radius of the Circle to 0.0
     */
    public CircleClass() {
        radius = 0.0;
    }

    /**
     * This method gets the value of the Circle's radius
     *
     * @return Circle radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * This method sets the value of Circle radius
     *
     * @param radius Circle radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * This method calculates and returns the area of the Circle
     *
     * @return area of the Circle
     */
    public double area() {
        double area = PI * radius * radius;
        return area;
    }

    /**
     * This method calculates and returns the diameter of the Circle
     *
     * @return Circle diameter
     */
    public double diameter() {
        double diameter = radius * 2;
        return diameter;
    }

    /**
     * This method calculates and returns the circumference of the Circle
     *
     * @return circumference of the Circle
     */
    public double circumference() {
        double circum = 2 * PI * radius;
        return circum;
    }  
}

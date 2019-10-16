/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MichaelRigoOseeBrou
 */
public class CarClass {
//car's year model
    private final String yearModel;
    //make of the car
    private final String make;
    //car's current speed
    private int speed;

    /**
     * Class constructor which accepts Cars year model and make
     *
     * @param model Car's year model
     * @param make the make of the Car
     */
    public CarClass(String model, String make) {
        yearModel = model;
        this.make = make;
        speed = 0;
    }

    /**
     * This method returns the Car's year model
     *
     * @return the Car's year model
     */
    public String getYearModel() {
        return yearModel;
    }

    /**
     * This method returns the make of the Car
     *
     * @return Car's make
     */
    public String getMake() {
        return make;
    }

    /**
     * This method returns the current speed of the Car
     *
     * @return speed of the Car
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * This method accelerates the Car by adding 5 to its speed
     */
    public void accelerate() {
        //add 5 to the speed of the Car
        speed = speed + 5;
    }

    /**
     * This method reduces the speed of the Car
     */
    public void brake() {
        //subtract 5 from the speed of the Car
        speed = speed - 5;
    }    
}

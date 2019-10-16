/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MichaelRigoOseeBrou
 */
public class CarClassDemo {
/**
     * The main method
     * @param args
     */
    public static void main(String[] args) {
        //creating a Car object
        System.out.println("Create a new Car");
        CarClass bmwCar = new CarClass ("2019 X5", "BMW");
        System.out.println("The car created is: ");
        System.out.println("Make: " + bmwCar.getMake());
        System.out.println("Model: " + bmwCar.getYearModel());
        System.out.println("Speed: " + bmwCar.getSpeed());

        System.out.println();

        //accelerate the car and displaying the speed
        System.out.println("Accelerating the car");
        bmwCar.accelerate();
        System.out.println("The speed of the Car now is: " + bmwCar.getSpeed());
        System.out.println();
        System.out.println("Accelerating the car");
        bmwCar.accelerate();
        System.out.println("The speed of the Car now is: " + bmwCar.getSpeed());
        System.out.println();
        System.out.println("Accelerating the car");
        bmwCar.accelerate();
        System.out.println("The speed of the Car now is: " + bmwCar.getSpeed());
        System.out.println();
        System.out.println("Accelerating the car");
        bmwCar.accelerate();
        System.out.println("The speed of the Car now is: " + bmwCar.getSpeed());
        System.out.println();
        System.out.println("Accelerating the car");
        bmwCar.accelerate();
        System.out.println("The speed of the Car now is: " + bmwCar.getSpeed());

        //reducing the speed of the Car
        System.out.println();
        System.out.println("Applying the brakes");
        bmwCar.brake();
        System.out.println("The speed of the Car now is: " + bmwCar.getSpeed());
        System.out.println();
        System.out.println("Applying the brakes");
        bmwCar.brake();
        System.out.println("The speed of the Car now is: " + bmwCar.getSpeed());
        System.out.println();
        System.out.println("Applying the brakes");
        bmwCar.brake();
        System.out.println("The speed of the Car now is: " + bmwCar.getSpeed());
        System.out.println();
        System.out.println("Applying the brakes");
        bmwCar.brake();
        System.out.println("The speed of the Car now is: " + bmwCar.getSpeed());
        System.out.println();
        System.out.println("Applying the brakes");
        bmwCar.brake();
        System.out.println("The speed of the Car now is: " + bmwCar.getSpeed());
    }    
}

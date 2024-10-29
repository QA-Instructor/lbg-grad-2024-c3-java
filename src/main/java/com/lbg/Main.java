package com.lbg;
import com.lbg.classes.*;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        javaPart1();
        javaPart2();
    }

    private static void javaPart2(){
        System.out.println("Java Part 2");
        Vehicle v1 = new Car();
        Vehicle v2 = new Car();
        Vehicle v3 = new Car();
        v3.setNumberOfWheels(2);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        String serviceInfo = v3.performService();
        System.out.println(serviceInfo);
        Car c1 = new Car(CarModel.FIESTA, CarMake.FORD, CarColour.RED);
        System.out.println(c1);
//        c1.setNumberOfWheels(4);
        System.out.println(c1.getNumberOfWheels());
        System.out.println(c1.getRegistrationNumber());
        System.out.println(c1.performService());
        Car c2 = new Car();
        Vehicle[] vehicles = {v1, v2, v3, c1, c2};
//        This is an example of POLYMORPHISM
        for (Vehicle v: vehicles){
            System.out.println(v); // toString
            System.out.println(v.performService());
        }
//        SubCar sc = new SubCar();
        System.out.println(c2.turnLeft());
        Vehicle[] moreVehicles = {c2};
        ISteerable[] steerables = {c2, c1};
        for (ISteerable s : steerables){
            System.out.println(s.turnLeft());
            System.out.println(s.brandNewMethod());
        }

    }
    private static void javaPart1() {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Car bartCar = new Car();
        bartCar.setColour(CarColour.RED);
        bartCar.setMake(CarMake.HONDA);
        bartCar.setModel(CarModel.JAZZ);
        bartCar.accelerate(30, CarSpeedUnit.MPH);
        System.out.println(bartCar.getSpeed());
        bartCar.decelerate(10, CarSpeedUnit.MPH);
        System.out.println(bartCar.getSpeed());
        Car lisaCar = new Car(CarModel.ASTRA, CarMake.VAUXHALL);
        lisaCar.setColour(CarColour.YELLOW);
        lisaCar.accelerate(40, CarSpeedUnit.KPH);
        System.out.println(lisaCar.getSpeed());
        int numCars = 100;
        Car[] cars = new Car[numCars];
        cars[0] = bartCar;
        cars[1] = lisaCar;
        Random rand = new Random();
        CarColour colour;
        int r;
        for (int i = 2; i < numCars; i++) {
            cars[i] = new Car();
            r = rand.nextInt(1000);
            if (r <= 300) {
                colour = CarColour.BLACK;
            } else if (r <= 600) {
                colour = CarColour.RED;
            } else if (r <= 850) {
                colour = CarColour.BLUE;
            } else {
                colour = CarColour.YELLOW;
            }
            cars[i].setColour(colour);
        }

        int redCars, blueCars, blackCars, yellowCars;
        redCars = blueCars = blackCars = yellowCars = 0;

        for (Car currentCar : cars) {
            switch (currentCar.getColour()) {
                case RED:
                    redCars++;
                    break;
                case BLUE:
                    blueCars++;
                    break;
                case BLACK:
                    blackCars++;
                    break;
                case YELLOW:
                    yellowCars++;
                    break;
            }
        }
        System.out.printf("Red cars: %d\nBlue cars: %d\nBlack cars: %d\nYellow cars: %d\n", redCars, blueCars, blackCars, yellowCars);

        processCar(bartCar);
        processCar(lisaCar);

        Car myCar = new Car(CarModel.JAZZ, CarMake.HONDA, CarColour.YELLOW);
        System.out.println(myCar);
    }

    public static void processCar(Car car){
        System.out.println(car.getColour());
        System.out.println(car);
        System.out.println(7);
    }
}










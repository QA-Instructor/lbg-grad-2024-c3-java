package com.lbg.classes;
import java.lang.Math;

//implicitly inherits from java.lang.Object

//car "is a kind of" vehicle
public final class Car extends Vehicle implements ISteerable{

//    this is an example of method overloading
    public Car(CarModel model, CarMake make, CarColour colour) {
        super(4, "Car Unregistered");
        this.model = model;
        this.make = make;
        this.colour = colour;
    }
    public Car(CarModel model, CarMake make) {
        this(model, make, CarColour.BLACK);
//        this.model = model;
//        this.make = make;
//        this.colour = CarColour.BLACK;
    }
    public Car() {
//        this is called constructor chaining
        this(CarModel.UNKNOWN, CarMake.UNKNOWN, CarColour.BLACK);
//        this.make = CarMake.UNKNOWN;
//        this.model = CarModel.UNKNOWN;
//        this.colour = CarColour.BLACK;
    }

    @Override
    public String someAbstractMethod() {
        return "This is the car abstract method";
    }

    //
    @Override
    public String performService() {
        String base =  super.performService();
        base += "...I am a Car";
        return base;
    }

    @Override
    public String toString() {
        String info = "Car: " + this.getMake();
        info += "\nModel: " + this.getModel();
        return info;
//        return super.toString();
    }

    private int speed;
    private CarMake make;
    private CarColour colour;
    private CarModel model;

    public int getSpeed() {
        return this.getSpeed(CarSpeedUnit.MPH);
    }

    public int getSpeed(CarSpeedUnit units) {
        switch (units) {
            case KPH:
                return (int) Math.floor(this.speed * 1.60);
            case MPS:
                return (int) Math.floor(this.speed * 0.45);
            case FPS:
                return (int) Math.floor(this.speed * 1.35);
            case MPH: default:
                return this.speed;
        }
    }

    public CarMake getMake() {
        return this.make;
    }

    public void setMake(CarMake make) {
        if (this.getMake().equals(CarMake.UNKNOWN)) {
            this.make = make;
        }
    }

    public CarColour getColour() {
        return this.colour;
    }

    public void setColour(CarColour newColour) {
        this.colour = newColour;
    }

    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel model) {
        if (this.getModel().equals(CarModel.UNKNOWN)) {
            this.model = model;
        }
    }

    public void accelerate(int deltaV, CarSpeedUnit units) {
        switch (units) {
            case KPH:
                this.speed += (int) Math.floor(deltaV / 1.60);
                break;
            case MPS:
                this.speed += (int) Math.floor(deltaV / 0.45);
                break;
            case FPS:
                this.speed += (int) Math.floor(deltaV / 1.35);
                break;
            case MPH: default:
                this.speed += deltaV;
                break;
        }
    }

    public void decelerate(int deltaV, CarSpeedUnit units) {
        if (deltaV > 0) {
            this.accelerate(-deltaV, units);
        }
    }

    @Override
    public String turnLeft() {
        return "Car is turning left";
    }

    @Override
    public String turnRight() {
        return "Car is turning right";
    }
}

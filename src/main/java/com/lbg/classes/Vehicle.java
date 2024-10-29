package com.lbg.classes;

public abstract class Vehicle {

    public Vehicle(){
        this.setNumberOfWheels(4);
        this.setRegistrationNumber("Unregistered");
    }

    public Vehicle(int numWheels, String regNumber){
        this.setNumberOfWheels(numWheels);
        this.setRegistrationNumber(regNumber);
    }

    public abstract String someAbstractMethod();

    public String performService(){
        return this.getRegistrationNumber() + ": Vehicle is being serviced";
    }

    @Override
    public String toString() {
        return "Vehicle " + this.getNumberOfWheels() + " " + this.getRegistrationNumber();
//        return super.toString();
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    private int numberOfWheels;

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    private String registrationNumber;

    protected String engineInfo;



}

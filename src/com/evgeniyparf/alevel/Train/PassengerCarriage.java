package com.evgeniyparf.alevel.Train;

public class PassengerCarriage extends Carriage{
    private int trainClass;
    private int maxCapacity;
    private int passengers;

    public PassengerCarriage(int pssngrClass, int passengers) {
        if(pssngrClass > 0 && pssngrClass <= 2) {
            this.trainClass = pssngrClass;
            this.maxCapacity = pssngrClass * 100;
            if (passengers <= maxCapacity)
                this.passengers = passengers;
            else {
                System.out.println("TRAIN OVERFLOW");
                this.passengers = maxCapacity;
            }
        }
    }

    public void setPassengers(int passengers){
        this.passengers = passengers;
    }

    public int getPassengers(){
        return passengers;
    }

    public void setTrainClass(int trainClass){
        this.trainClass = trainClass;
    }

    public int getTrainClass(){
        return trainClass;
    }

    @Override
    public String toString() {
        return "=[:passngr:" + trainClass + "cl:" + passengers + "]";
    }
}

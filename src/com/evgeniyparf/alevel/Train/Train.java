package com.evgeniyparf.alevel.Train;

import java.util.ArrayList;

public class Train {
    private BaseCarriage baseCarriage;
    private ArrayList<Carriage> carriages = new ArrayList<>();

    public Train(BaseCarriage baseCarriage, ArrayList<Carriage> carriages){
        this.baseCarriage = baseCarriage;
        this.carriages = carriages;
    }

    public ArrayList<Carriage> getCarriages(){
        return carriages;
    }

    public void addCarriage(Carriage carriage){
        carriages.add(carriage);
    }

    public void setCarriages(ArrayList<Carriage> carriages){
        this.carriages = carriages;
    }

    public BaseCarriage getBaseCarriage(){
        return baseCarriage;
    }

    public void setBaseCarriage(BaseCarriage baseCarriage){
        this.baseCarriage = baseCarriage;
    }

    @Override
    public String toString() {
        String train = baseCarriage.toString();
        for(Carriage c : carriages){
            train += c.toString();
        }
        return train;
    }
}

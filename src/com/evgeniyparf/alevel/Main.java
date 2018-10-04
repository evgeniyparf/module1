package com.evgeniyparf.alevel;

import com.evgeniyparf.alevel.Train.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Carriage> carriages = new ArrayList<>();
        carriages.add(new CargoCarriage(new Random().nextInt(CargoCarriage.MAX_CAPACITY)));
        carriages.add(new PassengerCarriage(2, new Random().nextInt(200)));
        carriages.add(new PassengerCarriage(1, new Random().nextInt(100)));
        carriages.add(new CargoCarriage(new Random().nextInt(CargoCarriage.MAX_CAPACITY)));
        carriages.add(new CargoCarriage(new Random().nextInt(CargoCarriage.MAX_CAPACITY)));
        carriages.add(new PassengerCarriage(2, new Random().nextInt(200)));

        Train train = new Train(new BaseCarriage(), carriages);
        System.out.println(train.toString());
    }
}

package org.example.model;

import static org.example.global.Vars.allToys;

public class addNewToy {
    static void addToListWithNewWeight(Toy newToy, int newWeight) {
        newToy.setWeight(newWeight);
        allToys.add(newToy);
    }
}

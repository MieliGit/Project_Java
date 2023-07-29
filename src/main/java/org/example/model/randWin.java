package org.example.model;

import java.util.ArrayList;
import java.util.Random;

public class randWin {
    static Toy selectRandomToy(ArrayList<Toy> winsToys) {

        Random rand = new Random();
        int winnerElement = rand.nextInt(winsToys.size());
        return winsToys.get(winnerElement);
    }

}

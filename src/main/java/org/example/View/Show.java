package org.example.View;

import org.example.model.Toy;

import java.util.ArrayList;

public class Show {
    public static void showNewList(ArrayList<Toy> myList) {
        int winListSize = myList.size();
        for (int i = 0; i < winListSize; i++) {
            System.out.print("Игрушка " + i +": " + myList.get(i).getName() + "\n ");
        }
        System.out.println(" ");
    }
}

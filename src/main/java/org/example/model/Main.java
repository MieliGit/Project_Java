package org.example.model;

import org.example.global.MyFileWriter;
import org.example.model.Toy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static org.example.View.Show.showNewList;
import static org.example.global.Vars.allToys;
import static org.example.global.Vars.winsToys;
import static org.example.model.MinWeight.selectToyByMinWeight;
import static org.example.model.addNewToy.addToListWithNewWeight;
import static org.example.model.randWin.selectRandomToy;

public class Main {

    public static void main(String[] args) {
        Toy car = new Toy(1, "Машинка", 2, 20);
        Toy robot = new Toy(2, "Робот", 1, 5);
        Toy airplane = new Toy(3, "Самолетик", 1, 10);
        Toy qube = new Toy(4, "Кубики", 1, 30);
        Toy lego = new Toy(5, "Лего", 2, 20);
        Toy puzzle = new Toy(6, "Пазл", 3, 8);

        addToListWithNewWeight(car, 5);
        addToListWithNewWeight(robot, 10);
        addToListWithNewWeight(airplane, 21);
        addToListWithNewWeight(qube, 7);
        addToListWithNewWeight(lego, 45);
        addToListWithNewWeight(puzzle, 67);


        System.out.println(" ");
        System.out.println("Меню: \n" +
                " 1 - Посмотреть список игрушек\n " +
                "2 - Играть\n" +
                " 3 - Выход");
        System.out.println(" ");
        System.out.println("Введите действие, которое хотите произвести: ");
        Scanner n = new Scanner(System.in);
        int num = Integer.parseInt(n.next());
        while (num != 3){
            if(num == 1){
                System.out.println("Все игрушки: ");
                showNewList(allToys);
            }
            if(num == 2){
                List<Toy> addedWinners = selectToyByMinWeight(allToys, 20);
                winsToys.addAll(addedWinners);

                System.out.println("Выигранные игрушки: ");
                showNewList(winsToys);

                Toy givedWinner = selectRandomToy(winsToys);
                allToys.remove(givedWinner);
                MyFileWriter.writeToy(givedWinner);
            }
            System.out.println(" ");
            System.out.println("Меню: \n" +
                    "1 - Посмотреть список игрушек\n " +
                    "2 - Играть\n" +
                    "3 - Выход");
            System.out.println(" ");
            System.out.println("Введите действие, которое хотите произвести: ");
            num = n.nextInt();
            n.nextLine();
        }


    }
}
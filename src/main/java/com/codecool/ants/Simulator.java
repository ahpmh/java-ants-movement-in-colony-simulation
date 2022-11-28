package com.codecool.ants;

import com.codecool.ants.geometry.Colony;

import java.util.Scanner;

public class Simulator {

    public static void main(String[] args) {
        //System.out.println("You can use `mvn package; java -jar target/ants-1.0.jar` to run this app from the console");
        Colony colony = new Colony(9);
        colony.generateAnts(8,2,2);
        Scanner scanner = new Scanner(System.in);
        boolean gameOn = true;
        while (gameOn) {
            colony.display();
            String input = scanner.nextLine();
            if (input.toLowerCase().equals("q")) {
                gameOn = false;
            }
            colony.update();
        }
    }
}

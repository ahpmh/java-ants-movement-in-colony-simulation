package com.codecool.ants.geometry;

import java.util.ArrayList;
import java.util.Random;

public class Colony {

    private int width;
    private ArrayList<Ants> positionsOfAnts;
    private QueenAnt queen;



/*A queen is created at construction time and is positioned at the center of the colony*/
    public Colony(int width){
        this.width = width;
        positionsOfAnts = new ArrayList<>();
        Position position = new Position(width/2, width/2);
        queen = new QueenAnt(position, width);
        positionsOfAnts.add(queen);
    }


/*Colony also has a generateAnts method with three integer arguments
that set the number of drones, workers, and soldiers to be created*/
    public void generateAnts(int drones, int workers, int soldiers){
        Random random = new Random();
        for (int i = 0; i < drones; i++) {
            Position position = Position.getRandomPosition(random, width);
            DroneAnt drone = new DroneAnt(position, width);
            positionsOfAnts.add(drone);
        }
        for (int i = 0; i < workers; i++) {
            Position position = Position.getRandomPosition(random, width);
            WorkerAnt worker = new WorkerAnt(position, width);
            positionsOfAnts.add(worker);
        }
        for (int i = 0; i < soldiers; i++) {
            Position position = Position.getRandomPosition(random, width);
            SoldierAnt soldier = new SoldierAnt(position, width);
            positionsOfAnts.add(soldier);
        }
    }


/* update method which invokes each ants' act method*/
    public void update(){
        for (Ants ants : positionsOfAnts) {
            ants.act();
        }
    }


/*displays the colony map*/
    public void display(){
        String result = "";
        for (int y = 0; y < width; y++) {
            for (int x = 0; x < width; x++) {
                Position position = new Position(x,y);
                result += getPositionSymbol(position);
            }
            result += "\n";
        }
        System.out.print(result +"\n");

    }

    private String getPositionSymbol(Position position) {
        String result = ". ";
        for (Ants ant : positionsOfAnts) {
            if (position.getX() == ant.getPositionOfAnts().getX() && position.getY() == ant.getPositionOfAnts().getY()) {
                result = ant.getSymbol() + " ";
            }
        }
        return result;
    }
}
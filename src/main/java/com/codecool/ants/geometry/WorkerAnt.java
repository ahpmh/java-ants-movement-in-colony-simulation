package com.codecool.ants.geometry;

import java.util.logging.XMLFormatter;

public class WorkerAnt extends  Ants{

    public WorkerAnt(Position position, int width){
        super(position, width);
        symbol = "W";
    }


    public void act(){
        Direction directionresult = Direction.getRandomDirection();
        int newX = antsInBed.getX() + directionresult.getXDirection();
        int newY = antsInBed.getY() + directionresult.getYDirection();
        if (!(newX < 0 || newX >= boardWidth || newY < 0 || newY >= boardWidth)) {
            antsInBed.setX(newX);
            antsInBed.setY(newY);
        }
    }


}

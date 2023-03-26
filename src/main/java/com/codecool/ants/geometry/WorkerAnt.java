package com.codecool.ants.geometry;

public class WorkerAnt extends  Ants{

    public WorkerAnt(Position position, int width){
        super(position, width);
        symbol = "W";
    }

    public void act(){
        Direction directionresult = Direction.getRandomDirection();
        int newX = positionOfAnts.getX() + directionresult.getXDirection();
        int newY = positionOfAnts.getY() + directionresult.getYDirection();
        if (!(newX < 0 || newX >= boardWidth || newY < 0 || newY >= boardWidth)) {
            positionOfAnts.setX(newX);
            positionOfAnts.setY(newY);
        }
    }
}

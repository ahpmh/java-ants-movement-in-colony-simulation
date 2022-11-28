package com.codecool.ants.geometry;

public class SoldierAnt extends Ants{

    Direction facingDirection;

    public SoldierAnt(Position position, int width){
        super(position, width);
        symbol = "S";
        facingDirection = Direction.getRandomDirection();
    }

    public void act(){
        int newX = antsInBed.getX() + facingDirection.getXDirection();
        int newY = antsInBed.getY() + facingDirection.getYDirection();
        if (!(newX < 0 || newX >= boardWidth || newY < 0 || newY >= boardWidth)) {
            antsInBed.setX(newX);
            antsInBed.setY(newY);
            facingDirection = Direction.turnLeft(facingDirection);
        }
    }



}

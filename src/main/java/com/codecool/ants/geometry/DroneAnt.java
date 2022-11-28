package com.codecool.ants.geometry;
public class DroneAnt extends Ants{


    public DroneAnt(Position position, int width){
        super(position, width);
        symbol = "D";
    }

    public void act(){
        int queenX = boardWidth / 2;
        int queenY = boardWidth / 2;
        Direction directionResult = null;
        if (antsInBed.getX() < queenX ) directionResult = Direction.EAST;
            else if (antsInBed.getX() > queenX ) directionResult = Direction.WEST;
                else if (antsInBed.getY() > queenY ) directionResult = Direction.NORTH;
                    else if (antsInBed.getY() < queenY ) directionResult = Direction.SOUTH;

        int newX = antsInBed.getX() + directionResult.getXDirection();
        int newY = antsInBed.getY() + directionResult.getYDirection();
        if (!(newX < 0 || newX >= boardWidth || newY < 0 || newY >= boardWidth)) {
            antsInBed.setX(newX);
            antsInBed.setY(newY);
        }

        if ((queenX == antsInBed.getX()) && (queenY == antsInBed.getY())) {
            Direction kickedDirection = Direction.getRandomDirection();
            newX = queenX + kickedDirection.getXDirection() * (boardWidth/2);
            newY = queenY + kickedDirection.getYDirection() * (boardWidth/2);
            antsInBed.setX(newX);
            antsInBed.setY(newY);
        }
    }
}

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
        if (positionOfAnts.getX() < queenX ) directionResult = Direction.EAST;
            else if (positionOfAnts.getX() > queenX ) directionResult = Direction.WEST;
                else if (positionOfAnts.getY() > queenY ) directionResult = Direction.NORTH;
                    else if (positionOfAnts.getY() < queenY ) directionResult = Direction.SOUTH;

        int newX = positionOfAnts.getX() + directionResult.getXDirection();
        int newY = positionOfAnts.getY() + directionResult.getYDirection();
        if (!(newX < 0 || newX >= boardWidth || newY < 0 || newY >= boardWidth)) {
            positionOfAnts.setX(newX);
            positionOfAnts.setY(newY);
        }

        if ((queenX == positionOfAnts.getX()) && (queenY == positionOfAnts.getY())) {
            Direction kickedDirection = Direction.getRandomDirection();
            newX = queenX + kickedDirection.getXDirection() * (boardWidth/2);
            newY = queenY + kickedDirection.getYDirection() * (boardWidth/2);
            positionOfAnts.setX(newX);
            positionOfAnts.setY(newY);
        }
    }
}

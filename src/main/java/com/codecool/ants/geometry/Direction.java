package com.codecool.ants.geometry;

import java.util.Random;

public enum Direction {
        NORTH, EAST, SOUTH, WEST;

     private Random random = new Random();

    public Direction getRandomDirection(){
        int randomDirection = random.nextInt(4);
        Direction result = null;
        switch (randomDirection) {
            case 0:
                result = NORTH;
                break;
            case 1:
                result = EAST;
                break;
            case 2:
                result = SOUTH;
                break;
            case 3:
                result = WEST;
                break;
        }
    return result;
    }


    }
package com.codecool.ants.geometry;

import java.util.Random;

public enum Direction {
        NORTH(0,-1), EAST(1,0), SOUTH(0,1), WEST(-1,0);
        private int x;
        private int y;

    Direction(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getXDirection() {
        return x;
    }

    public int getYDirection() {
        return y;
    }
    private static Random random = new Random();

    public static Direction getRandomDirection(){
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

    public static Direction turnLeft(Direction facingDirection){
        Direction result = null;
        switch (facingDirection) {
            case NORTH:
                result = WEST;
                break;
            case EAST:
                result = NORTH;
                break;
            case SOUTH:
                result = EAST;
                break;
            case WEST:
                result = SOUTH;
                break;
        }
        return result;
    }



    }
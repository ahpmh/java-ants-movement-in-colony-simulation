package com.codecool.ants.geometry;

import java.util.Random;

public class Position {

    public int x;
    public int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static Position getRandomPosition(Random random, int boardWith) {
        int randomX = random.nextInt(boardWith);
        int randomY = random.nextInt(boardWith);
        Position randomPosition = new Position(randomX,randomY);
        return randomPosition;
    }

}
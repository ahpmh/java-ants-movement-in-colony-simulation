package com.codecool.ants.geometry;

abstract public class Ants {
    protected Position positionOfAnts;
    protected String symbol;
    protected int boardWidth;

    public Ants(Position position, int width){
        positionOfAnts = position;
        boardWidth = width;
    }

    abstract public void act();

    public Position getPositionOfAnts() {
        return positionOfAnts;
    }

    public String getSymbol() {
        return symbol;
    }




}

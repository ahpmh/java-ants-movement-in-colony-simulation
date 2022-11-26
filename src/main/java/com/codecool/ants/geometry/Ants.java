package com.codecool.ants.geometry;

abstract public class Ants {
    protected Position antsInBed;
    protected String symbol;
    protected int boardWidth;

    public Ants(Position position, int width){
        antsInBed = position;
        boardWidth = width;
    }

    abstract public void act();

    public Position getAntsInBed() {
        return antsInBed;
    }

    public String getSymbol() {
        return symbol;
    }




}

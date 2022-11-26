package com.codecool.ants.geometry;

abstract public class Ants {
    Position antsInBed;
    String symbol;


    public Ants(Position position){
        antsInBed = position;
    }

    abstract public void act();

    public Position getAntsInBed() {
        return antsInBed;
    }

    public String getSymbol() {
        return symbol;
    }




}

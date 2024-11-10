package com.example.imagenesarrastrables.model;

public class ShipCatalog {
    private double positionX;
    private double positionY;
    private final double width;
    private final double height;

    public ShipCatalog(double positionX, double positionY, double width, double height) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    public double getHeight(){
        return height;
    }
}

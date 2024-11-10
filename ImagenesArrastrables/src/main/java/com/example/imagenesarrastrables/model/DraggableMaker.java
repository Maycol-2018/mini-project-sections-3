package com.example.imagenesarrastrables.model;

import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;

public class DraggableMaker {

    private double mouseAnchorX;
    private double mouseAnchorY;

    // Puede haber problema cuando se arrastre otro objeto, y estas variabes se actualicen
    // con ese objeto por lo que al retornar a la posicion inicial se posicionaria
    // en el lugar del anterior objeto. Solución: Posicion inicial independiente de cada barco
    private double initPositionX;
    private double initPositionY;

    public void makeDraggable(Node node) {
        initPositionX = node.getLayoutX();
        initPositionY = node.getLayoutY();

        node.setOnMousePressed((mouseEvent) -> {
            mouseAnchorX = mouseEvent.getX();
            mouseAnchorY = mouseEvent.getY();
            System.out.println("Eje x:" + mouseAnchorX);
        });
        node.setOnMouseDragged((mouseEvent) -> {
            node.setLayoutX(mouseEvent.getSceneX() - mouseAnchorX);
            node.setLayoutY(mouseEvent.getSceneY() - mouseAnchorY);
        });
    }

    public void showPosition(){
        System.out.println("Eje x:" + mouseAnchorX);
        System.out.println("Eje y:" + mouseAnchorY);
    }

    public void returnPosition(Node node){
        node.setLayoutX(initPositionX);
        node.setLayoutY(initPositionY);
    }

    public void limitsOfBase(Rectangle base, ImageView ship){
        // Starting position of base
        double positionBaseX = base.getLayoutX();
        double positionBaseY = base.getLayoutY();
        // Dynamic Position of ship
        double positionShipX = mouseAnchorX;
        double positionShipY = mouseAnchorY;

        double widthBaseX = base.getWidth();
        double heightBaseX = base.getHeight();

        double widthShipX = ship.getFitWidth();
        double heightShipY = ship.getFitHeight();

        // Coordinates of the maximum width of the base
        double limitBaseX = positionBaseX + widthBaseX;
        double limitBaseY = positionBaseY + heightBaseX;

        // Dynamic Position Limit of ship
        double limitShipX = positionShipX + widthShipX;
        double limitShipY = positionShipY + heightShipY;

//        if((limitShipX > limitBaseX) || (positionShipX < positionBaseX)){
//            returnPosition(ship);
//        }
        if((positionShipX < positionBaseX)){
            returnPosition(ship);
        }

        System.out.println("\nAsintota: "+positionBaseX + "\n Posicion lado izquierdo Barco: "+positionShipX);
    }
}

package com.example.imagenesarrastrables.controller;

import com.example.imagenesarrastrables.model.DraggableMaker;
import com.example.imagenesarrastrables.model.ShipCatalog;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;


public class WarshipController{
    @FXML
    private ImageView ship;
    @FXML
    private Rectangle base;

    DraggableMaker draggableMaker = new DraggableMaker();
    ShipCatalog shipCarrier;
    ShipCatalog baseShip;

    @FXML
    public void initialize() {
        shipCarrier = new ShipCatalog(ship.getLayoutX(), ship.getLayoutY(), ship.getFitWidth(), ship.getFitHeight());
        baseShip = new ShipCatalog(ship.getLayoutX(), ship.getLayoutY(), ship.getFitWidth(), ship.getFitHeight());

        draggableMaker.makeDraggable(ship);
    }

    @FXML
    void retornar(ActionEvent event) {
        //draggableMaker.returnPosition(ship);
        draggableMaker.limitsOfBase(base, ship);
        //draggableMaker.showPosition();
    }
}

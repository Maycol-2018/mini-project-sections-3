package com.example.imagenesarrastrables.controller;

import com.example.imagenesarrastrables.model.DraggableMaker;
import com.example.imagenesarrastrables.model.PositionBoard;
import com.example.imagenesarrastrables.model.ShipCatalog;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;


public class WarshipController{
    @FXML
    private ImageView ship;
    @FXML
    private Rectangle base;

    @FXML
    private GridPane gridPane;

    private PositionBoard positionBoard;

    DraggableMaker draggableMaker = new DraggableMaker();
    ShipCatalog shipCarrier;
    ShipCatalog baseShip;

    @FXML
    public void initialize() {
        this.positionBoard = new PositionBoard();
        createTable();
        shipCarrier = new ShipCatalog(ship.getLayoutX(), ship.getLayoutY(), ship.getFitWidth(), ship.getFitHeight());
        baseShip = new ShipCatalog(ship.getLayoutX(), ship.getLayoutY(), ship.getFitWidth(), ship.getFitHeight());

        draggableMaker.makeDraggable(ship);
    }

    public void createTable(){
        for(int i=1; i<11; i++){
            for(int j=1; j<11; j++){
                Button btn = new Button();
                String text = String.valueOf(this.positionBoard.getTable()[i-1][j-1]);
                btn.setText(text);
                btn.setPrefHeight(40);
                btn.setPrefWidth(40);
                btn.getStylesheets().add(String.valueOf(getClass().getResource("/com/example/imagenesarrastrables/css/styles-board.css")));
                btn.getStyleClass().add("button-value");
                gridPane.add(btn, j, i);
                //handleButtonWord(btn,text);
            }
        }

    }

    @FXML
    void retornar(ActionEvent event) {
        //draggableMaker.returnPosition(ship);
        draggableMaker.limitsOfBase(base, ship);
        //draggableMaker.showPosition();
    }
}

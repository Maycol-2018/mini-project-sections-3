package com.example.imagenesarrastrables;

import com.example.imagenesarrastrables.view.WarshipStage;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        WarshipStage.getInstance(); //
    }
}

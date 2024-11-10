package com.example.imagenesarrastrables.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WarshipStage extends Stage {
    public WarshipStage() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/imagenesarrastrables/warship-view.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        setScene(scene);

        setTitle("Warship");
        setResizable(false);

        show();
    }

    private static class MainStageHolder{
        private static WarshipStage INSTANCE;
    }

    public static WarshipStage getInstance() throws IOException{
        MainStageHolder.INSTANCE = MainStageHolder.INSTANCE != null ?
                MainStageHolder.INSTANCE : new WarshipStage();
        return MainStageHolder.INSTANCE;
    }

    public static void deletedInstance(){
        MainStageHolder.INSTANCE.close();
        MainStageHolder.INSTANCE = null;
    }


}

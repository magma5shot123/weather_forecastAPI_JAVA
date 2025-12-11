package com.example.Managers;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ScreenManager {
    
    private static Stage mainStage;
    private static Scene mainScene;

    public static void init(Stage stage) {
        mainStage = stage;
        mainStage.setResizable(false);
    }

    public static void show(Parent root) {
        if (mainScene == null) {
            mainScene = new Scene(root, 400, 400);
            mainStage.setScene(mainScene);
        } else {
            mainScene.setRoot(root);
        }
        mainStage.show();
    }
}

package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.awt.*;

/**
 * Created by sunri on 12-Nov-17.
 */
public class UTFT extends Application {

    private Scene mainScene;
    private Group root;
    private Stage oneAndOnlyStage;

    public void start(Stage primaryStage) throws Exception {
        root = new Group();
        mainScene = new Scene(root, 500, 500, Color.BLACK);
        oneAndOnlyStage = primaryStage;
        oneAndOnlyStage.setScene(mainScene);
        oneAndOnlyStage.show();
    }

    public void clrScr() {
        root.getChildren().clear();
        oneAndOnlyStage.show();
    }

    public void initLCD() {

    }

    public void print(String text, int x, int y) {
        Text newText = new Text();
        newText.setText(text);
        newText.setFont(new Font("Verdana", 12));
        newText.setX(x);
        newText.setY(y);
        newText.setFill(Color.WHITE);
        root.getChildren().add(newText);
    }
}


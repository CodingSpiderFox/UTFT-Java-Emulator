package sample;

import javafx.concurrent.Task;
import javafx.stage.Stage;

import java.io.PrintStream;


public class Main extends UTFT {

    UTFT instance = this;

    @Override
    public void start(Stage primaryStage) {
            Task<Void> task = new Task<Void>() {
                @Override
                public Void call() throws Exception {
                    System.out.print("entering loop");
                    Controller c = new Controller(instance);
                    c.setup();
                    while (true) {
                        c.loop();
                    }
                }
            };

            new Thread(task).start();

        try {
            super.start(primaryStage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
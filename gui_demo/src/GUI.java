
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GUI extends Application {                      // extends application

    public void start(Stage primaryStage) {                 // syntax 

        primaryStage.setTitle("creating buttons");

        Pane pane = new Pane();

        Button b = new Button("button");
        b.setLayoutX(pane.getWidth() / 2 - b.getWidth() / 2);
        b.setOnAction(e -> {
            pane.setStyle(
                    "-fx-background-color: rgb(" + (int) (Math.random() * 255) + ", " + (int) (Math.random() * 255)
                            + ", " + (int) (Math.random() * 255) + ");");
        });

        pane.getChildren().add(b);

        Scene sc = new Scene(pane, 200, 200);
        primaryStage.setScene(sc);
        primaryStage.show();
    }
}

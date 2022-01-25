package plant.app;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HelloController {
    public HelloController() {
    }

    public static EventHandler<ActionEvent> onClick(Button button) {
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                button.setText("button selected");
            }
        };
        return event;
    }

    public static void createLayout(Stage stage){
        VBox root = new VBox();
        StackPane layout = new StackPane();
        Scene scene = new Scene(layout, 400,400);
        Button button = new Button("stuff!");
        button.setOnAction(onClick(button));
        button.setFont(Font.font("Arial"));
        layout.getChildren().add(button);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
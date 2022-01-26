package plant.app;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.io.FileNotFoundException;
import java.net.URL;

/**
 * In this class you will find all the design related methods.
 */
public class Design {
    public static EventHandler<ActionEvent> onClick(Button button) {
        button.setFont(Font.font("Arial"));
        EventHandler<ActionEvent> event = e -> button.setText("button selected");
        return event;
    }

    /**
     *
     * @param stage
     * @throws FileNotFoundException
     */
    public void loadStart(Stage stage) throws FileNotFoundException {
        try {
            URL imageLocation = getClass().getResource("/images/bg.jpeg");
            Image image = new Image(String.valueOf(imageLocation));
            ImageView imageView = new ImageView(image);
            imageView.setFitHeight(700);
            imageView.setFitWidth(700);
            imageView.setOpacity(0.5);
            imageView.setPreserveRatio(true);
            StackPane layout = new StackPane();
            layout.getChildren().add(imageView);
            Button button = new Button();
            button.setText("click me!");
            layout.getChildren().add(button);
            onClick(button);
            Scene scene = new Scene(layout, 700, 700);
            stage.setTitle("My plant app");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        }catch (Exception e){
            System.err.println(e);
        }
    }


}
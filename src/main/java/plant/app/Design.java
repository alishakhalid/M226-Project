package plant.app;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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

    /**
     * @param button is the button which should be changed
     * @return an event handler is returned, which reacts to a click and changes the button
     */
    public static EventHandler<ActionEvent> identify(Button button) {
        button.setFont(Font.font("Arial"));
        EventHandler<ActionEvent> event = e -> button.setText("Identified!");
        return event;
    }

    /**
     * @param stage is the plant app window that is opened.
     * @throws FileNotFoundException an exception that is caught for when the background image
     *                               is not found.
     */
    public void loadBackground(Stage stage) throws FileNotFoundException {
        try {
            URL imageLocation = getClass().getResource("/bg.jpeg");
            Image image = new Image(String.valueOf(imageLocation));
            ImageView imageView = new ImageView(image);
            imageView.setFitHeight(700);
            imageView.setFitWidth(700);
            imageView.setOpacity(0.5);
            StackPane layout = new StackPane();
            layout.getChildren().add(imageView);
            Scene scene = new Scene(layout, 700, 700);
            stage.setTitle("My plant app");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
            throw e;
        }
    }
}
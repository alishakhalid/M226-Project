package plant.app;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *  This class is the main class which starts the entire plant app.
 *  Here you will only find a minimal amount of code.
 */
public class Starter extends Application {
    /**
     *
     * @param stage
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Design design = new Design();
        design.loadBackground(stage);
    }

    public static void main(String[] args) throws Exception {

    }
}
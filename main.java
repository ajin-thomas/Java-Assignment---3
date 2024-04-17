import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // custom title for the main window
        primaryStage.setTitle("JavaFX Application");

        // Create the root layout 
        StackPane root = new StackPane();

        // Create the main scene
        Scene scene = new Scene(root, 800, 600); 

        // Set the scene to the stage
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void Application(String[] args) {
        launch(args);
    }
}

package minigolf;

import Menu.StartMenu;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * This is the main class, with which we start the Application.
 * @author Jordan
 * @version 1.3
 * @date 20.03
 */
public class Main extends Application {
    public static Stage primaryStage;
    /**
     * Create an instance of StartMenu and run the application.
     * @param primaryStage primaryStage being visualised
     */
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        
        StackPane pane = new StackPane();
        pane.getChildren().add(new StartMenu());
        pane.setBackground(new Background(new BackgroundFill(Color.rgb(186, 216, 227), CornerRadii.EMPTY, Insets.EMPTY)));
        
        Scene scene = new Scene(pane);
        
        primaryStage.setTitle("Crazy Putting!");
        primaryStage.setScene(scene);
        
        primaryStage.setWidth(325);
        primaryStage.setHeight(425);
        
        Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
        primaryStage.setX((primScreenBounds.getWidth() - primaryStage.getWidth()) / 2);
        primaryStage.setY((primScreenBounds.getHeight() - primaryStage.getHeight()) / 2);
        
        primaryStage.show();
    }
    /**
     * Run the application.
     * @param args 
     */
    public static void main(String[] args) {
        launch(args);
    }
}


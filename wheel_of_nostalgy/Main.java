package wheel_of_nostalgy;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Main extends Application {
    public void start(Stage primary_stage) throws Exception {
        Font.loadFont(Main.class.getResource("Style/Comfortaa.ttf").toExternalForm(), 10);
        Font.loadFont(Main.class.getResource("Style/TagirDP.ttf").toExternalForm(), 10);
        Parent fxml = FXMLLoader.load(getClass().getResource("Options.fxml"));
        Scene primary_scene = new Scene(fxml, 1265, 705);
        primary_scene.getStylesheets().add("wheel_of_nostalgy/Style/Style.css");
        primary_stage.setScene(primary_scene);
        primary_stage.setResizable(false);
        primary_stage.getIcons().add(new Image("file:src/wheel_of_nostalgy/Images/Wheel.png"));
        primary_stage.setTitle("Колесо ностальгии");
        primary_stage.show();
    }
}
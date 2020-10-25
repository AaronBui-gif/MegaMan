package Controller;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.InputStream;

public class MainScreen {

    public Stage stage;
    @FXML private AnchorPane anchorMain;
    @FXML private ImageView imageMainScreen;

    public void setStage(Stage stage) { this.stage = stage; }

    public void init() {
        Image img = new Image("/resources/images/MegaManMainScreen.jpg");
        imageMainScreen = new ImageView(img);
    }

}

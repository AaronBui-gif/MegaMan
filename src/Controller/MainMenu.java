package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenu {
    @FXML private Button btnNewGame;
    @FXML private Button btnLoadGame;
    @FXML private Button btnOptions;
    private Stage stage;
    private MainMenu mainMenu;

    public void setStage(Stage stage){
        this.stage = stage;
    }

    // Button set on Action to open game board scene
    public void setNewGame(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/GameScreen.fxml"));

        Parent root = fxmlLoader.load();
        Stage newStage = new Stage();
        newStage.setScene(new Scene(root, 300, 300));
        newStage.setTitle("Mega Man");
        newStage.initOwner(stage);

//        newStage.getIcons().add(icon);


        GameScreen gameScreenController = fxmlLoader.getController();
        gameScreenController.init(newStage, mainMenu); // initialize the scene


        newStage.initModality(Modality.APPLICATION_MODAL);
        newStage.setResizable(false);
        newStage.showAndWait();
    }

    public void setLoadGame(ActionEvent actionEvent) {
    }

    public void setOptions(ActionEvent actionEvent) {
    }
}

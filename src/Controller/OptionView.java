package Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class OptionView {

    // Declare variables for FXML
    @FXML private Label labelControls;
    @FXML private Label labelBrightness;
    @FXML private Label labelAudio;
    @FXML private Label labelVibration;
    @FXML private Label stageSelectLabel;
    @FXML private Label labelExit;
    @FXML private Label SpecialWeaponLabel;


    // Declare variables
    private Parent root;
    private Stage stage;
    private WeaponShortcutView weaponShortcutView;
    /* *** Methods ***/
    public void weaponLabel(MouseEvent mouseEvent) throws IOException {
        stage = (Stage) SpecialWeaponLabel.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("WeaponShortcutView.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void controlsLabel(MouseEvent mouseEvent) {
    }

    public void brightnessLabel(MouseEvent mouseEvent) {
    }

    public void audioLabel(MouseEvent mouseEvent) {
    }

    public void vibrationLabel(MouseEvent mouseEvent) {
    }

    public void stageSelectAction(MouseEvent mouseEvent) {
    }

    public void exitAction(MouseEvent mouseEvent) {
        System.exit(0);
    }
}

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
    @FXML private Label SpecialWeaponLabel;
    @FXML private Slider brightnessSlider;
    @FXML private Slider volumeSlider;


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
}

import Controller.MainScreen;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        try{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("view/MainGUI.fxml"));
        Parent root = (Parent)loader.load();

        Scene scene = new Scene(root, 1200, 800);
        MainScreen mainScreen = (MainScreen) loader.getController();
        mainScreen.setStage(stage);
        mainScreen.init();


        stage.getIcons().add(new Image("images/icon.png"));
        stage.show();
    }
		catch(Exception e)
    {
        e.printStackTrace();
    }
    }
}

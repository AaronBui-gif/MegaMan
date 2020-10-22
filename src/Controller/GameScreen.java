package Controller;

import Model.Player;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GameScreen {
    private Player player;
    private Image heroImage;
    private ImageView hero;
    private String heroImageLink = "/resources/images/megasprite.png";
    // Constructor
    public GameScreen(Player player) {
        this.player = player;
    }

    public Player getPlayer(){
        return player;
    }

    public void init(Stage newStage, MainMenu mainMenu) {

    }

    public void start(Stage stage){
        heroImage = new Image(heroImageLink);
        hero = new ImageView(heroImage);
        Group group = new Group(hero);
        group.setManaged(false);

        Pane root = new Pane(group);
        root.setPrefSize(200, 200);

        Scene scene = new Scene(root);
        scene.setOnKeyPressed(keyEvent -> {
            double direction = -1;
            switch (keyEvent.getCode()) {
                case RIGHT: goRight = true; break;
                case LEFT: goLeft = true; break;
                case UP:
                case SPACE:
                    goUp = true; break;
                case DOWN: goDown = true; break;
                case SHIFT: goFast = true; break;
            }
        });

        scene.setOnKeyReleased(keyEvent -> {
            double direction = -1;
            switch (keyEvent.getCode()) {
                case RIGHT: goRight = false; break;
                case LEFT: goLeft = false; break;
                case UP:
                case SPACE:
                    goUp = false; break;
                case DOWN: goDown = false; break;
                case SHIFT: goFast = false; break;
            }
        });
        stage.setScene(scene);
        stage.show();
    }
}

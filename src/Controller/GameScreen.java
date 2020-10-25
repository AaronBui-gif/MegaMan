package Controller;

import Model.Player;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GameScreen {
    private final Player player;
    boolean goRight, goLeft, goUp, goDown, goFast;
    float dx = 0, dy = 0;
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
        String heroImageLink = "/resources/images/megasprite.png";
        Image heroImage = new Image(heroImageLink);
        ImageView hero = new ImageView(heroImage);
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

        if (goDown) dy -= 1;
        if (goUp) dy += 1;
        if (goLeft) dx -= 1;
        if (goRight) dx += 1;
        if (goFast){ dx *= 3; dy *= 3;}
    }
}

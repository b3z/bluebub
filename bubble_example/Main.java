package bubble_example;

import bluebub.Bubble;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {

  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    Group group = new Group();

    Bubble b1 = new Bubble("Hey, what's up?", "11:14");
    Bubble b2 = new Bubble("I am fine, thanks.\nHave you heard about the new bluebub library\nfor creating fancy chatbubbles?", "11:18 ✓");
    Bubble b3 = new Bubble("Yes, it is awesome!", "11:19");
    Bubble b4 = new Bubble("I know, that's why I am using it in my chat project...", "11:22 ✓");

    HBox chatline = new HBox();

    VBox theGuyIamChattingWith = new VBox();
    theGuyIamChattingWith.setPadding(new Insets(10));
    theGuyIamChattingWith.setSpacing(130);
    theGuyIamChattingWith.getChildren().addAll(b1, b3);


    VBox me = new VBox();
    me.setPadding(new Insets(90, 10, 10, 10));
    me.setSpacing(90);
    me.getChildren().addAll(b2, b4);


    chatline.getChildren().addAll(theGuyIamChattingWith, me);

    Scene scene = new Scene(group, 675, 400);
    group.getChildren().add(chatline);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}

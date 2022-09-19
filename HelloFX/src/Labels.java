

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class Labels extends Application {

	public Labels() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// setting up the pane
		VBox pane = new VBox();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(25,25,25,25));
		
		// labels
		Image catImage = new Image(getClass().getResourceAsStream("/catIcon.jpg"), 20,20,true,true);
		Label labelWithImage = new Label("Cat", new ImageView(catImage));
		Label longText = new Label("This is a long piece of text that will need some text wrapping.");
		longText.setWrapText(true);
		pane.getChildren().add(labelWithImage);
		pane.getChildren().add(longText);
		
		// label effects: rotate, translateY, translateX
		Label effects = new Label("Effects");
		effects.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		effects.setTextFill(Color.BLUEVIOLET);
		
		effects.setRotate(270);
		pane.getChildren().add(effects);
//		
//		effects.setTranslateY(100);

		// zoom
		Label letsZoom = new Label("Hover on me to zoom!");
		pane.getChildren().add(letsZoom);
		
		// so the label gets bigger when the mouse hovers over it
		letsZoom.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent e) {
				letsZoom.setScaleX(1.5);
				letsZoom.setScaleY(1.5);
			}
		});
		
		// so the label gets smaller when the mouse moves off it
		letsZoom.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent e) {
				letsZoom.setScaleX(1);
				letsZoom.setScaleY(1);
			}
		});
		
		
		// set scene and show primaryStage
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}

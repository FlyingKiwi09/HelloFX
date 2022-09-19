import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloButton extends Application {

	public HelloButton() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Hello World!");
		
		final Text text = new Text();
		text.setText("Noone has been greated");
		
		Button button = new Button();
		button.setText("Great you");
		
		button.setOnAction(new EventHandler<ActionEvent>() {
			int n = 0;
			@Override
			public void handle(ActionEvent arg0) {
				n++;
				
				text.setText("Hello has be said " + n + " times");
				
			}
			
		});
		
		VBox pane = new VBox();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(25,25,25,25));
		pane.getChildren().add(text);
		pane.getChildren().add(button);
		
		Scene scene = new Scene(pane, 300, 250);
		
		primaryStage.setTitle("Hello Button");
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}

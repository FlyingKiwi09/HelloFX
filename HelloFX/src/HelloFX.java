import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloFX extends Application {

	public HelloFX() {
		// TODO Auto-generated constructor stub
	}
	
	/*Notes
	 * 
	 * Stage: is the window. We can set the title for the window.
	 * Scene: is what is shown in the window
	 * 		- we can set the size
	 * 		- we can show it on a stage
	 * Text: has coordinates in the window and a string.
	 * 
	 * To run we need to use
	 * Application.launch()
	 * This sets up what we need to create a window and get a lot of funtionality 
	 * including: resize, expand and close the window*/

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Group root = new Group();
		Scene scene = new Scene(root);
		
		Text hello = new Text(25, 25, "Hello World!");
		Text address = new Text(50, 50, "My Address");
		Text phone = new Text(50, 100, "My Phone");
		
		root.getChildren().add(hello);
		root.getChildren().add(address);
		root.getChildren().add(phone);

		primaryStage.setTitle("Hello World!");
		
		primaryStage.setScene(scene);
		
		primaryStage.sizeToScene();
		
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}

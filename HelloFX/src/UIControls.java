import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UIControls extends Application {

	public UIControls() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		VBox pane = new VBox();
		
		
		
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}

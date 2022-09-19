import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

// further reading: https://docs.oracle.com/javafx/2/text/jfxpub-text.htm

public class PlayWithText extends Application {

	public PlayWithText() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Group root = new Group();
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm()); // links to the css doc for custom styles
		
		// setting properties of Text
		Text hello = new Text();
		hello.setX(100);
		hello.setY(100);
		hello.setText("Hello");
		hello.setFont(Font.getDefault()); // sets to the default text for the system (varies according to platform)
		hello.setFill(Color.RED);
		
		hello.setId("fancytext");
		
		
		Text address = new Text(50, 50, "My Address");
		address.setFont(Font.font("Verdana", 30));
		Text phone = new Text(50, 100, "My Phone");
		
		// bold and italic
		Text bold = new Text(100,200,"bold");
		bold.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		
		Text italic = new Text(100, 300, "italic");
		italic.setFont(Font.font("Verdana", FontPosture.ITALIC, 20));
		
		root.getChildren().add(hello);
		root.getChildren().add(address);
		root.getChildren().add(phone);
		root.getChildren().add(bold);
		root.getChildren().add(italic);

		primaryStage.setTitle("Hello World!");
		
		primaryStage.setScene(scene);
		
		primaryStage.sizeToScene();
		
		primaryStage.show();

	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}

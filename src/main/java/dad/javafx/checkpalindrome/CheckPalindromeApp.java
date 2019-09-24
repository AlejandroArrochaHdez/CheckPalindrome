package dad.javafx.checkpalindrome;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckPalindromeApp extends Application {

	private TextField nombreSentencia;
	private Button checkButton;
	private Label respuestaLabel;
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		nombreSentencia = new TextField();
		nombreSentencia.setPromptText("Introduce una sentencia");
		nombreSentencia.setMaxWidth(150);
		
		respuestaLabel = new Label("");
		
		checkButton = new Button("Comprobar");
		checkButton.setDefaultButton(true);
		checkButton.setOnAction(e -> onSaludarButtonAction(e));
		
		VBox root = new VBox();
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(nombreSentencia, checkButton, respuestaLabel);
		
		Scene scene = new Scene(root, 320, 200);
		
		primaryStage.setTitle("Check Palindrome");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	private void onSaludarButtonAction(ActionEvent e) {
		String sentencia = nombreSentencia.getText();
		
	    int x = sentencia.length()-1;
	    String aux="";
	    for(int i = x;i >= 0;i--){
	        aux = aux + sentencia.charAt(i);
	    }
	    if (aux.equals(sentencia)) {
			respuestaLabel.setText("Es palíndromo");
			respuestaLabel.setStyle("-fx-text-fill: green;");
	    }
	    else {
	    	respuestaLabel.setText("NO es palíndromo");
			respuestaLabel.setStyle("-fx-text-fill: red;");
	    }
	      
	}

	public static void main(String[] args) {
		launch(args);

	}

}

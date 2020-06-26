/**
*Date: 6/24/20
*Author: Adam Grimshaw
*Course: OOP
*Description: Creates text that can be manipulated with buttons.
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;

public class MovingText extends Application {
	protected Text text = new Text(80, 80, "WATCH ME MOVE");
	
	protected BorderPane getPane() {
		//Creates arrow buttons
		HBox paneForButtons = new HBox(20);
		Button btLeft = new Button("<--");
		Button btRight = new Button("-->");
		paneForButtons.getChildren().addAll(btLeft, btRight);
		paneForButtons.setAlignment(Pos.CENTER);
		paneForButtons.setStyle("-fx-border-color: gray");
		
		//Creates radio buttons
		HBox paneForRadioButtons = new HBox(20);
		RadioButton rbGreen = new RadioButton("Green");
		RadioButton rbGray = new RadioButton("Gray");
		RadioButton rbPink = new RadioButton("Pink");
		RadioButton rbPurple = new RadioButton("Purple");
		RadioButton rbOrange = new RadioButton("Orange");
		paneForRadioButtons.getChildren().addAll(rbPurple, rbPink, rbGreen, rbGray, rbOrange);
		paneForRadioButtons.setAlignment(Pos.CENTER);
		paneForRadioButtons.setStyle("-fx-border-color: gray");
		
		//Set buttons in pane
		BorderPane pane = new BorderPane();
		pane.setBottom(paneForButtons);
		pane.setTop(paneForRadioButtons);
		
		//Add text to pane
		Pane paneForText = new Pane();
		paneForText.getChildren().add(text);
		pane.setCenter(paneForText);
		Font futuraBoldItalic = Font.font("Helvetica Neue", FontWeight.BOLD, FontPosture.ITALIC, 32);
		text.setFont(futuraBoldItalic);
		text.setFill(Color.GRAY);
		
		//Actions for arrow buttons
		btLeft.setOnAction(e -> {
			System.out.println(text.getX());
			if(text.getX() > 0) {
				text.setX(text.getX() - 10);
			}
		});
		btRight.setOnAction(e -> {
			System.out.println(pane.getWidth());
			if(text.getX() < pane.getWidth() - 280) {
				text.setX(text.getX() + 10);
				System.out.println("Moving");
			}
		});
		
		//Toggle radio buttons
		ToggleGroup group = new ToggleGroup();
		rbGreen.setToggleGroup(group);
		rbGray.setToggleGroup(group);
		rbOrange.setToggleGroup(group);
		rbPink.setToggleGroup(group);
		rbPurple.setToggleGroup(group);
		rbGray.setSelected(true);
		
		//Actions for radio buttons
		rbGreen.setOnAction(e -> {
			if(rbGreen.isSelected()) {
				text.setFill(Color.GREEN);
			}
		});
		
		rbGray.setOnAction(e -> {
			if(rbGray.isSelected()) {
				text.setFill(Color.GRAY);
			}
		});
		
		rbPurple.setOnAction(e -> {
			if(rbPurple.isSelected()) {
				text.setFill(Color.PURPLE);
			}
		});
		
		rbPink.setOnAction(e -> {
			if(rbPink.isSelected()) {
				text.setFill(Color.PINK);
			}
		});
		
		rbOrange.setOnAction(e -> {
			if(rbOrange.isSelected()) {
				text.setFill(Color.ORANGE);
			}
		});
		
		return pane;
	}
	
	@Override
	public void start(Stage primaryStage) {
		Scene scene = new Scene(getPane(), 450, 200);
		primaryStage.setTitle("ButtonDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}

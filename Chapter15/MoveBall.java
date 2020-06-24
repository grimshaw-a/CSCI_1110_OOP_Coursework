/**
 * Date: 6.22.20
 * Author: Adam Grimshaw
 * Course: OOP
 * Description: Creates a circle and allows user to move it around screen using buttons and arrow keys.
 */


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MoveBall extends Application {
	int r = 10;
	
	@Override
	public void start(Stage primaryStage) {
		//Create circle
		Circle circle1 = new Circle(50);
		circle1.setCenterX(130);
		circle1.setCenterY(100);
		circle1.setStroke(Color.DARKORCHID);
		circle1.setFill(Color.LAVENDER);
		Pane circlePane = new Pane();
		circlePane.getChildren().add(circle1);
		
		//Create four buttons in HBox
		HBox hBox1 = new HBox(10);
		hBox1.setAlignment(Pos.CENTER);
		Button lbt = new Button("Left");
		Button rbt = new Button("Right");
		Button ubt = new Button("Up");
		Button dbt = new Button("Down");
		hBox1.getChildren().addAll(lbt, rbt, ubt, dbt);
		
		BorderPane borderPane1 = new BorderPane();
		borderPane1.setCenter(circlePane);
		borderPane1.setBottom(hBox1);
		BorderPane.setAlignment(hBox1, Pos.CENTER);
		
		//Create scene and populate it
		Scene scene1 = new Scene(borderPane1, 260, 200);
		System.out.println(scene1.getWidth());
		primaryStage.setTitle("Move the Ball");
		primaryStage.setScene(scene1);
		primaryStage.show();
		
		//Create event handlers for buttons
		lbt.setOnAction(e -> moveLeft(circle1));
		rbt.setOnAction(e -> moveRight(circle1, scene1));
		ubt.setOnAction(e -> moveUp(circle1));
		dbt.setOnAction(e -> moveDown(circle1, scene1));
		
		//Create event handlers for arrow keys
		borderPane1.setOnKeyPressed(e -> {
			switch (e.getCode()) {
			case LEFT: moveLeft(circle1); break;
			case RIGHT: moveRight(circle1, scene1); break;
			case UP: moveUp(circle1); break;
			case DOWN: moveDown(circle1, scene1); break;
			}
		});
		borderPane1.requestFocus();
	}
	
	public void moveLeft(Circle circle) {
		if(circle.getCenterX() > circle.getRadius()) {
		circle.setCenterX(circle.getCenterX() - r);
		}
	}
	
	public void moveRight(Circle circle, Scene scene) {
		if(circle.getCenterX() < scene.getWidth() - 50) {
		circle.setCenterX(circle.getCenterX() + r);
		}
	}
	
	public void moveUp(Circle circle) {
		if(circle.getCenterY() > circle.getRadius()) {
		circle.setCenterY(circle.getCenterY() - r);
		}
	}
	
	public void moveDown(Circle circle, Scene scene) {
		if(circle.getCenterY() < scene.getHeight() - 50) {
		circle.setCenterY(circle.getCenterY() + r);
		}
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
/*
class CirclePane extends Pane {
	private Circle circle = new Circle(50); 
	
	public CirclePane() {
		getChildren().add(circle);
		circle.setCenterX(0);
		circle.setCenterY(0);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
	}
	
	public void moveLeft() {
		if(circle.getCenterX() > circle.getRadius()) {
		circle.setCenterX(circle.getCenterX() - 5);
		}
	}
	
	public void moveRight() {
		circle.setCenterX(circle.getCenterX() + 5);
	}
}*/
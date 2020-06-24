/**
 * Date: 6.22.20
 * Author: Adam Grimshaw
 * Course: OOP
 * Description: Creates an animation that can be paused and played by clicking the mouse.
 */

import javafx.animation.PathTransition;
import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.collections.ObservableList;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.MouseButton;

public class AnimateRectangle extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		
		Rectangle rectangle = new Rectangle (0, 0, 25, 50);
		rectangle.setFill(Color.CYAN);
		rectangle.setStroke(Color.CYAN);
		
		Polygon pentagon = new Polygon();
		pentagon.setFill(Color.WHITE);
		pentagon.setStroke(Color.MAGENTA);
		ObservableList<Double> list = pentagon.getPoints();
		
		final double WIDTH = 200, HEIGHT = 200;
		double centerX = WIDTH / 2, centerY = HEIGHT / 2;
		double radius = Math.min(WIDTH,  HEIGHT) * 0.4;
		
		for(int i = 0; i < 5; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / 5));
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / 5));
		}
		
		pane.getChildren().add(pentagon);
		pane.getChildren().add(rectangle);
		
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(3500));
		pt.setPath(pentagon);
		pt.setNode(rectangle);
		pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setAutoReverse(true);
		pt.play();
		
		FadeTransition ft = new FadeTransition(Duration.millis(2000), rectangle);
		ft.setFromValue(1.0);
		ft.setToValue(0.0);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.setAutoReverse(true);
		ft.play();
		
		pane.setOnMousePressed(e -> {
			if(e.getButton() == MouseButton.SECONDARY) {
				pt.pause();
				ft.pause();
			} else if(e.getButton() == MouseButton.PRIMARY) {
				pt.play();
				ft.play();
			}
		});

		
		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("Path");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
			Application.launch(args);
	}
}

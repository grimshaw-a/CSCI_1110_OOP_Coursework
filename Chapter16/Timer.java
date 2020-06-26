/**
 * Date: 6.25.20
 * Author: Adam Grimshaw
 * Course: OOP
 * Description: Timer that ends with music playing.
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Region;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;


public class Timer extends Application {
  private static final String MEDIA_URL = 
    "https://archive.org/download/78_hawaiian-blues_johnny-dunns-original-jazz-hounds-bradford-brassfield_gbia0012510b/Hawaiian%20Blues%20-%20Johnny%20Dunn%27s%20Original%20Jazz%20Hounds-restored.mp3";
  private int counter = 30;

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
	//Create media player
    Media media = new Media(MEDIA_URL);
    MediaPlayer mediaPlayer = new MediaPlayer(media);
    mediaPlayer.setCycleCount(Timeline.INDEFINITE);

    //Create text-field for user input
    TextField inputText = new TextField("ex. 20");
    inputText.setEditable(true);
    inputText.setAlignment(Pos.BASELINE_RIGHT);
    inputText.setPrefWidth(100);
    
    BorderPane textPane = new BorderPane();
    textPane.setLeft(new Label("Enter duration for countdown:\nThen press Enter. "));
    textPane.setRight(inputText);
    textPane.setPrefHeight(50);

    //Create countdown timer
    Text countdown = new Text(50, 50, "?");
    countdown.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 92));
    Text secRemaining = new Text(50, 50, "seconds remaining");
    HBox countdownHolder = new HBox();
    countdownHolder.setAlignment(Pos.BASELINE_CENTER);
    countdownHolder.getChildren().add(countdown);
    countdownHolder.getChildren().add(secRemaining);
    
    VBox mainPane = new VBox(20);
    mainPane.getChildren().add(textPane);
    mainPane.getChildren().add(countdownHolder);
    mainPane.setAlignment(Pos.CENTER);
    
    //Countdown timer
    EventHandler<ActionEvent> timerEvent = e -> {
    	if(counter >= 0) {
    		countdown.setText(String.valueOf(counter));
        	counter--;
    	} else {
    		mediaPlayer.play();
    	}
    	
    };
    
    Timeline animation1 = new Timeline(new KeyFrame(Duration.millis(1000), timerEvent));
	animation1.setCycleCount(Timeline.INDEFINITE);
	
    mainPane.setOnKeyPressed(e -> {
		if(e.getCode() == KeyCode.ENTER) {
			animation1.stop();
			System.out.println("Enter");
			counter = Integer.parseInt(inputText.getText());
			animation1.play();
		}
    });

    // Create a scene and place it in the stage
    Scene scene = new Scene(mainPane, 300, 200);
    primaryStage.setTitle("Countdown to Music"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage    
  }

  public static void main(String[] args) {
    Application.launch(args);
  }
}
package javaFXPackage;

import java.awt.*;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.event.EventHandler;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MenuClass extends Application{
	@Override
	public void start(final Stage primaryStage) throws Exception {
		//setTitle
		primaryStage.setTitle("Menu");
		
		//create Button items
		Button button1 = new Button("Get the current date and time");
		Button button2 = new Button("Export date/time");
		Button button3 = new Button("Change frame color");
		Button button4 = new Button("Exit program");
		
		
		//add layout manager
		GridPane gridPane = new GridPane();
		
		//add and place buttons
		gridPane.add(button1, 0, 0, 1, 1);
		gridPane.add(button2, 1, 0, 1, 1);
		gridPane.add(button3, 0, 1, 1, 1);
		gridPane.add(button4, 1, 1, 1, 1);
		
		//add actions to buttons
		
		button1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
			LocalDate currentDate = LocalDate.now();
			LocalTime currentTime = LocalTime.now();
			Alert dateTimeAlert = new Alert(AlertType.INFORMATION, "The current date/time is " + currentDate + " " + currentTime);
			dateTimeAlert.show();
			}
		});
		
		button2.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent event) {
		        try (FileOutputStream outputFile = new FileOutputStream("log.txt");
		             PrintWriter outFS = new PrintWriter(outputFile)) {
		            LocalDate currentDate = LocalDate.now();
		            LocalTime currentTime = LocalTime.now();
		            outFS.println("Date: " + currentDate + " Time: " + currentTime);
		            System.out.println("File exported successfully: log.txt");
		        } catch (IOException e) {
		            System.out.println("An error occurred while exporting the file: " + e.getMessage());
		        }
		    }
		});

				
		button3.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent event) {
		        // Set background color for the scene
		        gridPane.getScene().getRoot().setStyle("-fx-background-color: green");
		    }
		});

		
		button4.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent event) {
		        primaryStage.close();
		    }
		});
		
		
		Scene scene = new Scene(gridPane, 240, 100);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);

	}

}



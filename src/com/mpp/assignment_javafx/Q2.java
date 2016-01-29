package com.mpp.assignment_javafx;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.paint.*;

public class Q2 extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Adress Form");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.TOP_LEFT);
		grid.setHgap(10);
		grid.setVgap(10);

		Button btnCount = new Button("Count Letters");
		grid.add(btnCount, 5, 2);

		Button reverseLetter = new Button("Reverse Letters");
		grid.add(reverseLetter, 5, 4);

		Button removeDuplicate = new Button("Remove Duplicate");
		grid.add(removeDuplicate, 5, 6);

		Label input = new Label("Input ");
		grid.add(input, 6, 2);

		TextField txtInput = new TextField();
		grid.add(txtInput, 6, 3);

		Label output = new Label("Output ");
		grid.add(output, 6, 4);

		TextField txtOutput = new TextField();
		grid.add(txtOutput, 6, 5);
		/*
		 * Label street = new Label("Street "); grid.add(street, 3, 1);
		 * 
		 * TextField txtStreet = new TextField(); grid.add(txtStreet, 3, 2);
		 * 
		 * Label city = new Label("City "); grid.add(city, 5, 1);
		 * 
		 * TextField txtCity = new TextField(); grid.add(txtCity, 5, 2);
		 * 
		 * Label state = new Label("State "); grid.add(state, 2, 3);
		 * 
		 * TextField txtState = new TextField(); grid.add(txtState, 2, 4);
		 * 
		 * Label zip = new Label("Zip "); grid.add(zip, 4, 3);
		 * 
		 * TextField txtZip = new TextField(); grid.add(txtZip, 4, 4);
		 * 
		 * Button btn = new Button("Submit"); HBox hbBtn = new HBox(10);
		 * hbBtn.setAlignment(Pos.BOTTOM_RIGHT); hbBtn.getChildren().add(btn);
		 * grid.add(hbBtn, 3, 5);
		 * 
		 * btn.setOnAction(new EventHandler<ActionEvent>() {
		 * 
		 * @Override public void handle(ActionEvent e) {
		 * 
		 * System.out.println(txtName.getText());
		 * System.out.println(txtStreet.getText());
		 * System.out.println(txtCity.getText());
		 * System.out.println(txtState.getText());
		 * System.out.println(txtZip.getText()); } });
		 */

		Scene scene = new Scene(grid, 400, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
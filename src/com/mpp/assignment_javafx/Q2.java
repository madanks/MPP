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

		btnCount.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				if (txtInput.getText().trim().equals("") || txtInput.getText().trim().equals(null)) {

				} else {
					int count = txtInput.getText().length();
					txtOutput.setText(Integer.toString(count));
				}

			}
		});

		reverseLetter.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				if (txtInput.getText().trim().equals("") || txtInput.getText().trim().equals(null)) {

				} else {
					String revString = "";
					for (int i = 0; i < txtInput.getText().trim().length(); i++) {
						revString = txtInput.getText().charAt(i) + revString;
					}
					txtOutput.setText(revString);
				}

			}
		});

		removeDuplicate.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				if (txtInput.getText().trim().equals("") || txtInput.getText().trim().equals(null)) {

				} else {
					String remove = "" + txtInput.getText().charAt(0);
					for (int i = 1; i < txtInput.getText().trim().length(); i++) {
						boolean flag = true;
						for (int j = 0; j < remove.length(); j++) {
							if (txtInput.getText().charAt(i) == remove.charAt(j)) {
								flag = false;
							}
						}
						if (flag) {
							remove += txtInput.getText().charAt(i);
						}
					}
					txtOutput.setText(remove);
				}

			}
		});

		Scene scene = new Scene(grid, 400, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
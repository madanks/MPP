package com.mpp.assignment_javafx_sceanbuilder;

import java.util.Arrays;
import java.util.stream.Collectors;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Q2_Controller implements EventHandler<ActionEvent> {
	public Button btnCount;
	public Button btnReverse;
	public Button btnDuplicate;

	public TextField txtInput;
	public TextField txtOutput;

	@Override
	public void handle(ActionEvent event) {
		if (event.getSource() == btnCount) {

			if (txtInput.getText().trim().equals("") || txtInput.getText().trim().equals(null)) {

			} else {
				int count = txtInput.getText().length();
				txtOutput.setText(Integer.toString(count));
			}

		} else if (event.getSource() == btnReverse) {
			if (txtInput.getText().trim().equals("") || txtInput.getText().trim().equals(null)) {

			} else {
				String revString = "";
				for (int i = 0; i < txtInput.getText().trim().length(); i++) {
					revString = txtInput.getText().charAt(i) + revString;
				}
				txtOutput.setText(revString);
			}

		} else if (event.getSource() == btnDuplicate) {
			if (txtInput.getText().trim().equals("") || txtInput.getText().trim().equals(null)) {

			} else {
				String[] input = txtInput.getText().split("");
				txtOutput.setText(Arrays.asList(input).stream().distinct().collect(Collectors.joining()));
			}
		}

	}

}

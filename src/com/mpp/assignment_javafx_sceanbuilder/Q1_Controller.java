package com.mpp.assignment_javafx_sceanbuilder;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Q1_Controller implements EventHandler<ActionEvent> {

	@FXML
	private TextField txtName;
	@FXML
	private TextField txtStreet;
	@FXML
	private TextField txtCity;
	@FXML
	private TextField txtState;
	@FXML
	private TextField txtZip;
	@FXML
	public Button btnSubmit;

	@Override
	public void handle(ActionEvent event) {
		System.out.println(txtName.getText());
		System.out.println(txtStreet.getText());
		System.out.println(txtCity.getText());
		System.out.println(txtState.getText());
		System.out.println(txtZip.getText());

	}

}

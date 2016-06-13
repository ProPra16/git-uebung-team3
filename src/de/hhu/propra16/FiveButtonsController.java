package de.hhu.propra16;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

/**
 * Created by Tobias Witt on 06.06.16.
 */
public class FiveButtonsController {
	private @FXML Button tooManyButton;
	
	public void tooManyButtonAction() {
		new Alert(AlertType.ERROR, "Too Many Buttons!").showAndWait();
	}
}

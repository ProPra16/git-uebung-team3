package de.hhu.propra16;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.time.LocalDateTime;

/**
 * Created by Tobias Witt on 06.06.16.
 */
public class FiveButtonsController {
    @FXML
    private Button tooManyButton;
    @FXML
    private Label timeLabel;

    public void tooManyButtonAction() {
        new Alert(AlertType.ERROR, "Too Many Buttons!").showAndWait();
    }


    @FXML
    public void showTime() {
        timeLabel.setText(LocalDateTime.now().toLocalTime().toString());
    }
}

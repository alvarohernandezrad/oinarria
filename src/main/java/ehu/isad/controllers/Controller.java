package ehu.isad.controllers;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField txtErabiltzailea;

    @FXML
    private TextField txtPasahitza;

    @FXML
    private Label lblErabiltzailea;

    @FXML
    private Label lblPasahitza;

    @FXML
    private Button btnKautotu;

    @FXML
    void onClick(ActionEvent event) {
        System.out.println(txtErabiltzailea.getText()+":"+txtPasahitza.getText());
    }

}
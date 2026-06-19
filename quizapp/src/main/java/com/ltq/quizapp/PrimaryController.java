package com.ltq.quizapp;

import com.ltq.MyAlertSingleton;
import com.ltq.utills.themes.ThemeTypes;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;

public class PrimaryController implements Initializable{
    @FXML private ComboBox<com.ltq.utills.themes.ThemeTypes> cbTheme;

    
    
    
    public void managerQuestions(ActionEvent e) {
        MyAlertSingleton.getInstance().showMeg("Coming soon ...");
        
    }
    
    public void practice(ActionEvent e) {
        MyAlertSingleton.getInstance().showMeg("Coming soon ...");
       
    }
    
    public void exam(ActionEvent e) {
        MyAlertSingleton.getInstance().showMeg("Coming soon ...");
    }
    
    public void changeTheme(ActionEvent e){
        switch (this.cbTheme.getSelectionModel().getSelectedItem()) 
        {
            case Dark:
                this.cbTheme.getScene().getRoot().getStylesheets().clear();
                this.cbTheme.getScene().getRoot().getStylesheets().add(App.class.getResource("dark.css").toExternalForm());
                break;
            case Light:
                this.cbTheme.getScene().getRoot().getStylesheets().clear();
                this.cbTheme.getScene().getRoot().getStylesheets().add(App.class.getResource("light.css").toExternalForm());
                break;
            default:
                this.cbTheme.getScene().getRoot().getStylesheets().clear();
                this.cbTheme.getScene().getRoot().getStylesheets().add(App.class.getResource("styles.css").toExternalForm());
                break;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbTheme.setItems(FXCollections.observableArrayList(ThemeTypes.values()));
    }
}

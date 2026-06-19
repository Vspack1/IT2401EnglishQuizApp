package com.ltq.quizapp;

import com.ltq.utils.MyAlertSingleton;
import com.ltq.utils.themes.DarkFactory;
import com.ltq.utils.themes.LightFactory;
import com.ltq.utils.themes.ThemeManager;
import com.ltq.utils.themes.ThemeTypes;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;


public class PrimaryController implements Initializable {
    @FXML private ComboBox<ThemeTypes> cbThemes;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(ThemeTypes.values()));
    }
    
    public void manageQuestions(ActionEvent e) {
        MyAlertSingleton.getInstance().showMsg("Comming soon...");
        
    }
    
    public void practice(ActionEvent e) {
        MyAlertSingleton.getInstance().showMsg("Comming soon...");
    }
    
    public void exam(ActionEvent e) {
        MyAlertSingleton.getInstance().showMsg("Comming soon...");
    }
    
    public void changeTheme(ActionEvent e) {
        this.cbThemes.getSelectionModel().getSelectedItem().updateTheme(this.cbThemes.getScene());
    }
}

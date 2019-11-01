/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap_project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
/**
 *
 * @author lenovo
 */
public class FXMLDocumentController implements Initializable {
    Stage stage;
    
    @FXML
    private void New_Game(ActionEvent event) throws IOException {
        System.out.println("New Game");
        stage = AP_Project.stage;
        Parent root = FXMLLoader.load(getClass().getResource("New_Game.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
    }
    
    @FXML
    private void Resume_Game(ActionEvent event) {
        System.out.println("Resume Games");
    }
    @FXML
    private void Settings(ActionEvent event) {
        System.out.println("Settings...");
    }
    @FXML
    private void Exit(ActionEvent event) {
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

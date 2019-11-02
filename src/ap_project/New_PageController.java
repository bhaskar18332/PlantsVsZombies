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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author lenovo
 */
public class New_PageController implements Initializable {
    
    Stage stage;
    @FXML
    private TextField Name;

    
    @FXML
    private void new_Login(ActionEvent event) throws IOException {
        
        AP_Project.name = Name.getText();
        stage = AP_Project.stage;
        System.out.println(AP_Project.name);
        Parent root = FXMLLoader.load(getClass().getResource("Level_Page.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
    }
    @FXML
    private void Back(ActionEvent event) throws IOException {
        
        
        stage = AP_Project.stage;
        System.out.println(AP_Project.name);
        Parent root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

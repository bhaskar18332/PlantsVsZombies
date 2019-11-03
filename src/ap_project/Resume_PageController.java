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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author lenovo
 */
public class Resume_PageController implements Initializable {

    Stage stage = AP_Project.stage;
    /**
     * Initializes the controller class.
     */
    @FXML
    private void resume(ActionEvent e) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("GamePage.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void save(ActionEvent e) throws IOException
    {
        System.out.println("Saving...");
    }
    @FXML
    private void restart(ActionEvent e) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("GamePage.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void main_menu(ActionEvent e) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("Home_Page.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

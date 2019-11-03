/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap_project;

import static ap_project.Level_PageController.stage;
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
 * FXML Controller class
 *
 * @author Bhaskar
 */
public class Home_PageController implements Initializable {

    Stage stage = AP_Project.stage;
    @FXML
    private Label user_name;
    @FXML
    private void home_back(ActionEvent e) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("New_Page.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void level(ActionEvent e) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("Level_Page.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void shop(ActionEvent e) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("Shop_Page.fxml"));
        
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
        user_name.setText(AP_Project.name);
    }    
    
}

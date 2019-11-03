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
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author lenovo
 */
public class Level_PageController implements Initializable {

    static Stage stage = AP_Project.stage;
    static int i=1;
    @FXML
    private ImageView previous;
    @FXML
    private Button back;
    @FXML
    private ImageView next;
    @FXML
    private Button previousbt;
    @FXML
    private Button nextbt;
    @FXML
    private ImageView normalzombie;
    @FXML
    private ImageView conezombie;
    @FXML
    private ImageView bucketzombie;
    @FXML
    private ImageView shieldzombie;
    @FXML
    private ImageView l1;
    @FXML
    private ImageView l2;
    @FXML
    private ImageView l3;
    @FXML
    private ImageView l4;
   
    @FXML
    private void Level_Back(ActionEvent event) throws IOException {
        
        
        Parent root = FXMLLoader.load(getClass().getResource("Home_Page.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
    }
    @FXML
    private void next(ActionEvent e)
    {
        if(i==1)
        {
            normalzombie.setOpacity(0);
            l1.setOpacity(0);
            conezombie.setOpacity(1);
            l2.setOpacity(1);
            i++;
        }
        else if(i==2)
        {
            conezombie.setOpacity(0);
            l2.setOpacity(0);
            bucketzombie.setOpacity(1);
            l3.setOpacity(1);
            i++;
        }
        else if(i==3)
        {
            bucketzombie.setOpacity(0);
            l3.setOpacity(0);
            shieldzombie.setOpacity(1);
            l4.setOpacity(1);
            i++;
        }
        else if(i==4)
        {
            normalzombie.setOpacity(1);
            l4.setOpacity(0);
            shieldzombie.setOpacity(0);
            l1.setOpacity(1);
            i=1;
        } 
        AP_Project.level=i;
    }
    @FXML
    private void previous(ActionEvent e)
    {
        if(i==1)
        {
            normalzombie.setOpacity(0);
            l1.setOpacity(0);
            shieldzombie.setOpacity(1);
            l4.setOpacity(1);
            i=4;
        }
        else if(i==2)
        {
            conezombie.setOpacity(0);
            l2.setOpacity(0);
            normalzombie.setOpacity(1);
            l1.setOpacity(1);
            i--;
        }
        else if(i==3)
        {
            bucketzombie.setOpacity(0);
            l3.setOpacity(0);
            conezombie.setOpacity(1);
            l2.setOpacity(1);
            i--;
        }
        else if(i==4)
        {
            shieldzombie.setOpacity(0);
            l4.setOpacity(0);
            bucketzombie.setOpacity(1);
            l3.setOpacity(1);
            i--;
        }
        AP_Project.level=i;
    }
    
    @FXML
    private void start_game(ActionEvent e) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("GamePage.fxml"));
        
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

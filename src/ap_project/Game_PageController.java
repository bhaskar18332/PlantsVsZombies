/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap_project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author lenovo
 */
public class Game_PageController implements Initializable {

    Stage stage = AP_Project.stage;
    
    @FXML
    private ImageView mower1;
    @FXML
    private ImageView mower3;
    @FXML
    private ImageView mower4;
    @FXML
    private ImageView mower5;
    @FXML
    private ImageView mower2;
    @FXML
    private ImageView shooter1;
    @FXML
    private ImageView shooter2;
    @FXML
    private ImageView pea1;
    @FXML
    private ImageView pea2;
    @FXML
    private ImageView pea3;
    @FXML
    private ImageView pea4;
     @FXML
    private ImageView zombie1;
      @FXML
    private ImageView zombie2;
    @FXML
    private void pause(ActionEvent e) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("Resume_Page.fxml"));
        
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
        TranslateTransition p1 = new TranslateTransition();
        TranslateTransition p2 = new TranslateTransition();
        TranslateTransition p3 = new TranslateTransition();
        TranslateTransition p4 = new TranslateTransition();
        TranslateTransition z1 = new TranslateTransition();
        TranslateTransition z2 = new TranslateTransition();
        TranslateTransition m1 = new TranslateTransition();
        TranslateTransition m2 = new TranslateTransition();
        pea1.setOpacity(0);
        pea2.setOpacity(0);
        pea3.setOpacity(0);
        pea4.setOpacity(0);
        
        pea1.setOpacity(1);
        p1.setDuration(Duration.seconds(5));
        p1.setNode(pea1);
        p1.setToX(600);
        p1.setCycleCount(1000);
        p1.play();
        
        p2.setDelay(Duration.seconds(2));
        pea2.setOpacity(1);
        p2.setDuration(Duration.seconds(5));
        p2.setNode(pea2);
        p2.setToX(600);
        p2.setCycleCount(1000);
        p2.play();
        
        p3.setDelay(Duration.seconds(2));
        pea3.setOpacity(1);
        p3.setDuration(Duration.seconds(5));
        p3.setNode(pea3);
        p3.setToX(600);
        p3.setCycleCount(1000);
        p3.play();
        
        p4.setDelay(Duration.seconds(4));
        pea4.setOpacity(1);
        p4.setDuration(Duration.seconds(5));
        p4.setNode(pea4);
        p4.setToX(600);
        p4.setCycleCount(1000);
        p4.play();
        
        
        z1.setNode(zombie1);
        z1.setToX(-600);
        z1.setDuration(Duration.seconds(10));
        z1.play();
        z1.setOnFinished(e->
        {
            zombie1.setOpacity(0);
            m1.setNode(mower1);
            m1.setDuration(Duration.seconds(5));
            m1.setToX(600);
            m1.play(); 
        });
        
        z2.setDelay(Duration.seconds(1));
        z2.setNode(zombie2);
        z2.setToX(-600);
        z2.setDuration(Duration.seconds(10));
        z2.play();
        z2.setOnFinished(e->
        {
            zombie2.setOpacity(0);
            m2.setNode(mower5);
            m2.setDuration(Duration.seconds(5));
            m2.setToX(650);
            m2.play();
        });
        
        m1.setOnFinished(e->
        {
            mower1.setOpacity(0);
        });
        
        m2.setOnFinished(e->
        {
            mower5.setOpacity(0);
        });
        
        
    }    
    
}

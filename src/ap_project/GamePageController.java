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
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author lenovo
 */
public class GamePageController implements Initializable {

    Stage stage = AP_Project.stage;
    private Timeline animation;
    private String s="";
    private int tmp = 15;
    
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
    private ImageView sun1;
    @FXML
    private ImageView sun2;
    @FXML
    private ImageView sun3;
    @FXML
    private ImageView sun4;
    @FXML
    private Label score;
    @FXML
    private Label suntokens;
    @FXML
    private Label timer;
    @FXML
    private ImageView clicktostart;
    @FXML
    private Button clicktostartbt;
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
    private void timeLabel()
    {
        if(tmp>0)
            tmp--;
        s=tmp+"";
        timer.setText(s);
    }
    
    @FXML
    private void start(ActionEvent e)
    {
        clicktostart.setDisable(true);
        clicktostart.setOpacity(0);
        clicktostartbt.setDisable(true);
        TranslateTransition p1 = new TranslateTransition();
        TranslateTransition p2 = new TranslateTransition();
        TranslateTransition p3 = new TranslateTransition();
        TranslateTransition p4 = new TranslateTransition();
        TranslateTransition z1 = new TranslateTransition();
        TranslateTransition z2 = new TranslateTransition();
        TranslateTransition m1 = new TranslateTransition();
        TranslateTransition m2 = new TranslateTransition();
        TranslateTransition s1 = new TranslateTransition();
        TranslateTransition s2 = new TranslateTransition();
        TranslateTransition s3 = new TranslateTransition();
        TranslateTransition s4 = new TranslateTransition();
         
        animation = new Timeline(new KeyFrame(Duration.seconds(1),e8->timeLabel()));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
        
        p1.setDuration(Duration.seconds(5));
        p1.setNode(pea1);
        p1.setToX(650);
        p1.setCycleCount(1000);
        p1.play();
            
 
        p2.setDelay(Duration.seconds(2));
        p2.setDuration(Duration.seconds(5));
        p2.setNode(pea2);
        p2.setToX(650);
        p2.setCycleCount(1000);
        p2.play();
        
        
        s1.setDuration(Duration.seconds(7));
        s1.setNode(sun1);
        s1.setToY(500);
        s1.play();
        
        p3.setDelay(Duration.seconds(2));
        p3.setDuration(Duration.seconds(5));
        p3.setNode(pea3);
        p3.setToX(650);
        p3.setCycleCount(1000);
        p3.play();
        
        s2.setDelay(Duration.seconds(7));
        s2.setDuration(Duration.seconds(7));
        s2.setNode(sun2);
        s2.setToY(500);
        s2.play();
        
        p4.setDelay(Duration.seconds(4));
        p4.setDuration(Duration.seconds(5));
        p4.setNode(pea4);
        p4.setToX(650);
        p4.setCycleCount(1000);
        p4.play();
        
        s3.setDelay(Duration.seconds(11));
        s3.setDuration(Duration.seconds(7));
        s3.setNode(sun3);
        s3.setToY(500);
        s3.play();
        
        z1.setNode(zombie1);
        z1.setToX(-600);
        z1.setDuration(Duration.seconds(15));
        z1.play();
        
        
        s4.setDelay(Duration.seconds(15));
        s4.setDuration(Duration.seconds(7));
        s4.setNode(sun4);
        s4.setToY(500);
        s4.play();
        
        z1.setOnFinished(e1->
        {
            zombie1.setOpacity(0);
            m1.setNode(mower1);
            m1.setDuration(Duration.seconds(5));
            m1.setToX(650);
            m1.play(); 
        });
        
        z2.setDelay(Duration.seconds(1));
        z2.setNode(zombie2);
        z2.setToX(-600);
        z2.setDuration(Duration.seconds(15));
        z2.play();
        z2.setOnFinished(e2->
        {
            zombie2.setOpacity(0);
            m2.setNode(mower5);
            m2.setDuration(Duration.seconds(5));
            m2.setToX(700);
            m2.play();
        });
        
        m1.setOnFinished(e3->
        {
            mower1.setOpacity(0);
        });
        
        m2.setOnFinished(e4->
        {
            mower5.setOpacity(0);
        });
        
        s2.setOnFinished(e5->
        {
            sun1.setOpacity(0);
        });
        s3.setOnFinished(e6->
        {
            sun2.setOpacity(0);
        });
        s4.setOnFinished(e7->
        {
            sun3.setOpacity(0);
            Parent root;
            try {
                root = FXMLLoader.load(getClass().getResource("Game_Over.fxml"));
                Scene scene = new Scene(root);
        
                stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(GamePageController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

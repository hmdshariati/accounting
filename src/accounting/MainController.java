/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounting;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 * FXML Controller class
 *
 * @author hamid
 */
public class MainController implements Initializable {

    @FXML
    private Color x2;
    @FXML
    private Font x1;
    @FXML
    private Label status;
    @FXML
    private Color x4;
    @FXML
    private Font x3;
    @FXML
    private AnchorPane viewpane;


    /**
     * Initializes the controller class.
     * @param url
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
 
    }    

    @FXML
    private void ProductForm(ActionEvent event) {
              try {
                AnchorPane pane = (AnchorPane) FXMLLoader.load(getClass().getResource("ProductForm.fxml"));
                viewpane.getChildren().setAll(pane);
    } catch (IOException e) {
       // e.printStackTrace();
    }  
    }
    
}

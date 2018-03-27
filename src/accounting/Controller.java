package accounting;

import java.io.IOException;
import javafx.fxml.Initializable;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller implements Initializable {
    public LoginModel loginModel = new LoginModel();
    @FXML
    private TextField username;
    
    @FXML
    private TextField password;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("View is now loaded!");
    }
    
    public void login (ActionEvent event) throws IOException{
        try {
            if (loginModel.isLogin(username.getText(), password.getText())){
                    showOrigin();
            } else {
                signInBtn.setText("try again");
            }
        } catch (SQLException e) {
            signInBtn.setText("a problem");
            e.printStackTrace();
        }
    }
    public Button signInBtn;
    public void signInBtnClk(){
        
    }

    private void showOrigin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
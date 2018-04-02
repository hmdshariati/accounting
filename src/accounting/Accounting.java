package accounting;

import com.sun.javafx.application.LauncherImpl;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Accounting extends Application {

    public static void main (String[] args) {
        launch(args);
        //InitialData.main(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("signin.fxml"));
        primaryStage.setTitle("صفحه ورود");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        

        
    }



}
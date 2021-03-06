/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sidemenu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class SideMenu extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Font.loadFont(
        SideMenu.class.getResource("CrackMan.TTF").toExternalForm(), 
        10);
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLSideMenu.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
}

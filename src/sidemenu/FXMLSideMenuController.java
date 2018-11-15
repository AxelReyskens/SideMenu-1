package sidemenu;

import com.jfoenix.controls.JFXButton;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class FXMLSideMenuController {
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Pane pnl_spelers;

    @FXML
    private Pane pnl_moeilijkheid;

    @FXML
    private Pane pnl_thema;

    @FXML
    private Pane pnl_highscore;

    @FXML
    private Pane pnl_credits;

    @FXML
    private Pane pnl_main;

    @FXML
    private FontAwesomeIconView icon_close;

    @FXML
    private JFXButton btn_spelers;

    @FXML
    private JFXButton btn_moeilijkheid;

    @FXML
    private JFXButton btn_thema;

    @FXML
    private JFXButton btn_highscore;

    @FXML
    private JFXButton btn_credits;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if(event.getSource() == btn_spelers) {
            pnl_spelers.toFront();
        } else
        if(event.getSource() == btn_moeilijkheid) {
            pnl_moeilijkheid.toFront();
        } else
        if(event.getSource() == btn_thema) {
            pnl_thema.toFront();
        } else 
        if(event.getSource() == btn_highscore) {
            pnl_highscore.toFront();
        } else 
        if(event.getSource() == btn_credits) {
            pnl_credits.toFront();
        }
    }
    
    @FXML
    private void closeMenuItem(ActionEvent event) {
        if(event.getSource() == icon_close) {
            pnl_main.toFront();
        }
    }
    
    @FXML
    void initialize() {
    }
    
}


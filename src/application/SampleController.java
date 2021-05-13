package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SampleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ClickBtn;
    
    @FXML
    private Label title;
    
    @FXML
    private Label lbl;

    @FXML
    public void onClickBtnClicked(ActionEvent event) {
    	lbl.setText("Hello JavaFx!");
    	
    }
    @FXML
    public void initialize() {
        assert ClickBtn != null : "fx:id=\"ClickBtn\" was not injected: check your FXML file 'Sample.fxml'.";
        title.setText("Title");
        
    }
}
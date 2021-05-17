package application;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.image.*;
import javafx.scene.control.DatePicker;


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
    private Label datelist;
    
    @FXML
    private ImageView imagev;
    
    @FXML
    private DatePicker datepicker;
    
    @FXML
    public void onClickBtnClicked(ActionEvent event) {
    	//LocalDate -> String
    	LocalDate localDate = datepicker.getValue();
    	String date = localDate.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
    	lbl.setText("Hello JavaFx!");
    	datelist.setText(date);
    	//Load Image
    	Image image = new Image("sample01.jpg");
    	imagev.setImage(image);
    	
    }
    
    @FXML
    public void initialize() {
        assert ClickBtn != null : "fx:id=\"ClickBtn\" was not injected: check your FXML file 'Sample.fxml'.";
        title.setText("Title");
        
    }
}
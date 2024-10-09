package project6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller3 {
@FXML
private CheckBox mycheckbox;
@FXML
private Label mylabel;
@FXML
private ImageView myimageview;
Image image1 = new Image(getClass().getResourceAsStream("bendy image.png"));
Image image2 = new Image(getClass().getResourceAsStream("jbl image6.jpg"));
public void change(ActionEvent event) {
	if(mycheckbox.isSelected()) {
		mylabel.setText("ON");
		myimageview.setImage(image1);
	}
	else {
		mylabel.setText("OFF");
		myimageview.setImage(image2);
	}
}
}

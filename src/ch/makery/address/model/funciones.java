package ch.makery.address.model;

import javafx.fxml.FXML;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;

public class funciones {
	@FXML
	private ImageView img1;//id de la imagen

	
	public void imgSombreado(){
		
			img1.setEffect(new GaussianBlur(40));
		
		
	}
	
	@FXML
	public void salirX(){
		System.exit(0);
	}
}

package application;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.fxml.Initializable;

 
public class Corona  implements Initializable {

	
	  @FXML
	    private TableView<Test> tablo;

	    @FXML
	    private TableColumn<Test, String> hastaadikolon;

	    @FXML
	    private TableColumn<Test, String> sehirkolon;

	    @FXML
	    private TableColumn<Test, String> meslekkolon;

	    @FXML
	    private TableColumn<Test, String> cinsiyetkolon;

	    @FXML
	    private TableColumn<Test, Double> ateskolon;

	    @FXML
	    private TableColumn<Test, String> teshiskolon;

	    @FXML
	    private TextField hastaadfxid;

	    @FXML
	    private ComboBox<String> sehirfxid;

	    @FXML
	    private RadioButton erkekradio;
	    
	    @FXML
	    private ToggleGroup cinsiyetradio;
	 
	    @FXML
	    private RadioButton kadinradio;

	    @FXML
	    private Slider atesfxid;

	    @FXML
	    private CheckBox pozitifcheck;

	    @FXML
	    private CheckBox negatifcheck;

	    @FXML
	    private RadioButton ogrenciradio;

	    @FXML
	    private ToggleGroup meslekradio;
	    
	    @FXML
	    private RadioButton memurradio;

	    @FXML
	    private Label ateslabelfxid;
	    
	    @FXML
	    private RadioButton emekliradio;

	    @FXML
	    private RadioButton isciradio;

	    @FXML
	    private Label sonuc;
	   

	    ObservableList<Test> hasta=FXCollections.observableArrayList();
	    
	    @FXML
	    void eklebut(ActionEvent event) {

	    	String hastaisim=hastaadfxid.getText();
	    	RadioButton cins=(RadioButton) cinsiyetradio.getSelectedToggle();
	    	String cinsiyetradio=cins.getText();
	    	String hastasehir=sehirfxid.getValue();
	    	RadioButton hastameslek=(RadioButton) meslekradio.getSelectedToggle();
	    	String meslekradio=hastameslek.getText();
	    	String teshissonuc="";
	    	if(pozitifcheck.isSelected())
	    	{
	    	teshissonuc="pozitif";
	    	}
	    	else if(negatifcheck.isSelected())
	    	{
	    		teshissonuc="negatif";
	    	}
	    	
	    	double ates = atesfxid.getValue();
	    	
	    	hasta.add(new Test(hastaisim,hastasehir,meslekradio,cinsiyetradio,ates,teshissonuc));
	    	tablo.refresh();
	    	
	    	alert("Kayýt Baþarýyla Tamamlanmýþtýr");
		
			
	    		
	    }

	    public void alert(String a) {
	    	Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Bilgi Mesajý");
			alert.setContentText(a);

			alert.showAndWait();
	    }
	    
	    @FXML
	    void guncellebut(ActionEvent event) {

	    	Test degisken=tablo.getSelectionModel().getSelectedItem();
	    	String hastaisim=hastaadfxid.getText();
	    	RadioButton cins=(RadioButton) cinsiyetradio.getSelectedToggle();
	    	String cinsiyetradio=cins.getText();
	    	String hastasehir=sehirfxid.getValue();
	    	RadioButton hastameslek=(RadioButton) meslekradio.getSelectedToggle();
	    	String meslekradio=hastameslek.getText();
	    	String teshissonuc="";
	    	if(pozitifcheck.isSelected())
	    	{
	    	teshissonuc="pozitif";
	    	}
	    	else if(negatifcheck.isSelected())
	    	{
	    		teshissonuc="negatif";
	    	}
	    	
	    	double ates = atesfxid.getValue();
	    	
	    	 int action = JOptionPane.showConfirmDialog(null, "Emin misiniz ?");
		        if(action == 0)
	    	
	    	{
	    	degisken.setHastaad(hastaisim);
	    	degisken.setSehir(hastasehir);
	     degisken.setMeslek(meslekradio);
	    	degisken.setCinsiyet(cinsiyetradio);
	    	degisken.setAtes(ates);
	    	degisken.setTeshis(teshissonuc);
	    	tablo.refresh();
	    	}
	    	
	    }

	    @FXML
	    void silbut(ActionEvent event) {

	    	Test degisken=tablo.getSelectionModel().getSelectedItem();
	    	 int action = JOptionPane.showConfirmDialog(null, "Emin misiniz ?");
		        if(action == 0)
		        {
	    	hasta.remove(degisken);
	    	tablo.refresh();
		        }
	    }

	    @FXML
	    void sorgulabut(ActionEvent event) {

	    }
	    ObservableList<String> sehirler;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		tablo.setItems(hasta);
		hastaadikolon.setCellValueFactory(new PropertyValueFactory<>("hastaad"));
		sehirkolon.setCellValueFactory(new PropertyValueFactory<>("sehir"));
		meslekkolon.setCellValueFactory(new PropertyValueFactory<>("meslek"));
		cinsiyetkolon.setCellValueFactory(new PropertyValueFactory<>("cinsiyet"));
		ateskolon.setCellValueFactory(new PropertyValueFactory<>("ates"));
	    teshiskolon.setCellValueFactory(new PropertyValueFactory<>("teshis"));
	    
	    sehirler=FXCollections.observableArrayList("Ankara","Hatay","Adana","Kilis","Bolu");
	    sehirfxid.setItems(sehirler);
		
		
	
	}

}

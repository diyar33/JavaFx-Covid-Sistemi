package application;

import javafx.collections.ObservableList;

public class Test {
String hastaad;
String sehir;
String meslek;
String cinsiyet;
Double ates;
String teshis;

public Test (String tabadi, String tabsehir, String tabmeslek, String tabcinsiyet, Double tabates, String tabteshis
) 

{
	this.hastaad=tabadi;
	this.sehir=tabsehir;
	this.meslek=tabmeslek;
	this.cinsiyet=tabcinsiyet;
	this.ates=tabates;
	this.teshis=tabteshis;
	
}

public String getHastaad() {
	return hastaad;
}

public String getSehir() {
	return sehir;
}

public String getMeslek() {
	return meslek;
}

public String getCinsiyet() {
	return cinsiyet;
}

public Double getAtes() {
	return ates;
}

public String getTeshis() {
	return teshis;
}

public void setHastaad(String hastaad) {
	this.hastaad = hastaad;
}

public void setSehir(String sehir) {
	this.sehir = sehir;
}

public void setMeslek(String meslek) {
	this.meslek = meslek;
}

public void setCinsiyet(String cinsiyet) {
	this.cinsiyet = cinsiyet;
}

public void setAtes(Double ates) {
	this.ates = ates;
}

public void setTeshis(String teshis) {
	this.teshis = teshis;
}





}

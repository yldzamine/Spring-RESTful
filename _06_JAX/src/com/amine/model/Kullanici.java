package com.amine.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="kullanici")
public class Kullanici implements Serializable {
 
	@XmlElement(name="id")
	 int kullaniciId;
	
	@XmlElement(name="adi")
	String kullaniciadi;
	
	@XmlElement(name="soyadi")
	 String kullanicisoyadi;

	public int getKullaniciId() {
		return kullaniciId;
	}

	public void setKullaniciId(int kullaniciId) {
		this.kullaniciId = kullaniciId;
	}

	public String getKullaniciadi() {
		return kullaniciadi;
	}

	public void setKullaniciadi(String kullaniciadi) {
		this.kullaniciadi = kullaniciadi;
	}

	public String getKullanicisoyadi() {
		return kullanicisoyadi;
	}

	public void setKullanicisoyadi(String kullanicisoyadi) {
		this.kullanicisoyadi = kullanicisoyadi;
	}
}

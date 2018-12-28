package com.amine;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="musteri")
public class Musteri {

	
	private int musteriId;
	private String musteriadi;
	private String musterisehir;
	//---------------------------------
	@XmlAttribute
	public int getMusteriId() {
		return musteriId;
	}
	
	public void setMusteriId(int musteriId) {
		this.musteriId = musteriId;
	}
	//---------------------------------
	@XmlElement
	public String getMusteriadi() {
		return musteriadi;
	}
	public void setMusteriadi(String musteriadi) {
		this.musteriadi = musteriadi;
	}
	//---------------------------------
	@XmlElement
	public String getMusterisehir() {
		return musterisehir;
	}
	public void setMusterisehir(String musterisehir) {
		this.musterisehir = musterisehir;
	}
	//---------------------------------
}

package model;

import javax.persistence.Column;


public class CompInfo extends Base{
	
	@Column(name = "nameComp")
	private String nameComp;
	
	@Column(name = "adrBS")
	private String adrBS;
	
	@Column(name = "carrier")
	private String carrier;
	
	@Column(name = "insurer")
	private String insurer;

	public String getNameComp() {
		return nameComp;
	}

	public void setNameComp(String nameComp) {
		this.nameComp = nameComp;
	}

	public String getAdrBS() {
		return adrBS;
	}

	public void setAdrBS(String adrBS) {
		this.adrBS = adrBS;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getInsurer() {
		return insurer;
	}

	public void setInsurer(String insurer) {
		this.insurer = insurer;
	}

}

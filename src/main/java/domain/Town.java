package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


public class Town extends Base{
	
	@Column(name = "city")
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	

}

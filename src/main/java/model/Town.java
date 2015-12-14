package model;

import javax.persistence.Column;

@Entity
@Table(name = "TOWN")
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

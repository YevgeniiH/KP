package model;

import javax.persistence.Column;

@Entity
@Table(name = "DRIVER")
public class Driver extends Base{
	
	@Column(name = "busNmb")
	private String busNmb;
	
	@Column(name = "idUser")
	private Integer idUser;

	public String getBusNmb() {
		return busNmb;
	}

	public void setBusNmb(String busNmb) {
		this.busNmb = busNmb;
	}

	public Integer getidUser() {
		return idUser;
	}

	public void setidUser(Integer idUser) {
		this.idUser = idUser;
	}
}

package model;

import javax.persistence.Column;


public class Cashier extends Base{
	
	@Column(name = "idUser")
	private Integer idUser;

	public Integer getidUser() {
		return idUser;
	}

	public void setidUser(Integer idUser) {
		this.idUser = idUser;
	}

}

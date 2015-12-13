package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


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

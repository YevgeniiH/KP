package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


public class StatusUsr extends Base{
	
	@Column(name = "statusU")
	private String statusU;

	public String getStatusU() {
		return statusU;
	}

	public void setStatusU(String statusU) {
		this.statusU = statusU;
	}

}

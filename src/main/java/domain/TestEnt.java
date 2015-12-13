package domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: TestEnt
 *
 */
public class TestEnt implements Serializable {

	 
	private String name;
	private static final long serialVersionUID = 1L;	
	public TestEnt() {
		super();
	} 
	   
	public String getName() {
 		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
   
}

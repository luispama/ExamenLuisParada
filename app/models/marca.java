package models;

import javax.persistence.Entity;
import play.db.jpa.Model;


@Entity
public class marca  extends Model{
	
	public String empresa;
	
	public marca(String empre){
		
		empresa = empre;
		
		
	}

}

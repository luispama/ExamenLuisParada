package models;

import javax.persistence.Entity;
import play.db.jpa.Model;


@Entity
public class automoviles  extends Model{
	
	public String nombre;
	public int modelo;
	
	public automoviles(String nom, int mod){
		
		nombre= nom;
		modelo = mod;
		
	}

}

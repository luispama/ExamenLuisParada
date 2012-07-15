package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void alta(String nom, int mod) {
        
    	automoviles c = null;
    	 if (nom != null && !nom.equals("")){
    	
    		 c = new automoviles (nom, mod).save();
    		 
    	 }
    	
    	render(c);
    }
    
    public static void altaMarca(String empre) {
    	
    	marca m = null;
   	 		if (empre != null && !empre.equals("")){
   	
   	 			m = new marca (empre).save();
   		 
   	 		}
   	 		render(m);
    }
    
    public static void cambio(String nom1, String nom2) {
    	
    	automoviles c = null;
   	 		if (nom1 != null && !nom1.equals("")){
   	
   	 			c = automoviles.find("byNombre", nom1).first();
   	 			
   	 			if (c != null){
   	 				
   	 				c.nombre = nom2;
   	 				c.save();
   	 				
   	 			}
   		 
   	 		}
   	 		render(c);
    }

    public static void cambioMarca(String emp1, String emp2) {
	
    	marca m = null;
	 		if (emp1 != null && !emp1.equals("")){
	
	 			m = marca.find("byEmpresa", emp1).first();
	 			
	 			if (m != null){
	 				
	 				m.empresa = emp2;
	 				m.save();
	 				
	 			}
		 
	 		}
	 		render(m);
    }
    
    public static void borrar(String nom) {
    	automoviles c = null;
    	
    	if(nom != null && !nom.equals("")){
    		c = automoviles.find("byNombre", nom).first();
    			if(c != null){
    				
    				c.delete();
    			
    			}
    	
    		}
    	render(c);
    	
    }
    
    public static void borrarMarca(String empre) {
    	marca m = null;
    	
    	if(empre != null && !empre.equals("")){
    		m = marca.find("byEmpresa", empre).first();
    			if(m != null){
    				
    				m.delete();
    			
    			}
    	
    		}
    	render(m);
    	
    }

}
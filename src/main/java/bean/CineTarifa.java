package bean;

import java.util.ArrayList;
import java.util.List;

public class CineTarifa {
	String DiasSemana="",Precio="";
	
	public CineTarifa () {
		
	}
	
	public CineTarifa (String DiasSemana,String Precio) {
		this.DiasSemana = DiasSemana;
		this.Precio = Precio;
	}
	
	
	public String getDiasSemana() {
		return DiasSemana;
	}
	
	public void setDiasSemana(String DiasSemana) {
		this.DiasSemana = DiasSemana;
	}
	
	public String getPrecio() {
		return Precio;
	}
	
	public void setPrecio (String Precio) {
		this.Precio = Precio;
	}
	
	public List <CineTarifa> getCineTarifaList (String [][] mRegistro){
		if (mRegistro == null ) 
			return null;
		
		List <CineTarifa> lstCT = new ArrayList<>(); 
		for ( String [] acinetarifa : mRegistro)
		lstCT.add(new CineTarifa (acinetarifa[0],acinetarifa[1]));	
		
		return lstCT;
	}
	
	
	
	
	
}












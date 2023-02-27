package bean;

import java.util.ArrayList;
import java.util.List;

public class CinePelicula {
	String Titulo="",Horarios="";
	
	public CinePelicula () {
		
	}
	
	public CinePelicula (String Titulo,String Horarios) {
		this.Titulo = Titulo;
		this.Horarios = Horarios;
	}
	
	
	public String getTitulo() {
		return Titulo;
	}
	
	public void setTitulo(String Titulo) {
		this.Titulo = Titulo;
	}
	
	public String getHorarios() {
		return Horarios;
	}
	
	public void setHorarios (String Horarios) {
		this.Horarios = Horarios;
	}
	
	public List <CinePelicula> getCinePeliculaList( String[][] mRegistros){
	if ( mRegistros ==	null ) 
		return null;
	
	List <CinePelicula> lstCP =  new ArrayList<>() ;
	for ( String[] acinepelicula : mRegistros )
	lstCP.add( new CinePelicula( acinepelicula[0] ,acinepelicula[1]));
	return lstCP;
	}
	
}









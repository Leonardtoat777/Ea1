package bean;

import java.util.ArrayList;
import java.util.List;

public class Cine {
	int idCine,salas,idDistrito;
	String RazonSocial="",Direccion="",Telefono="",Detalle="";
	boolean Eliminado,valido;
	
	public int getIdCine() {
		return idCine;
	}
	public void setIdCine(int idCine) {
		this.idCine = idCine;
	}
	public int getSalas() {
		return salas;
	}
	public void setSalas(int salas) {
		this.salas = salas;
	}
	public int getIdDistrito() {
		return idDistrito;
	}
	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}
	public String getRazonSocial() {
		return RazonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		RazonSocial = razonSocial;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getDetalle() {
		return Detalle;
	}
	public void setDetalle(String detalle) {
		Detalle = detalle;
	}
	public boolean isEliminado() {
		return Eliminado;
	}
	public void setEliminado(boolean eliminado) {
		Eliminado = eliminado;
	}
	public boolean isValido() {
		return valido;
	}
	public void setValido(boolean valido) {
		this.valido = valido;
	}
	
	public Cine() {
		super();
	}
	
	
	public Cine (String [] aRegistro) {
		if (aRegistro == null) return;
		
		idCine= Integer.parseInt(aRegistro[0]);
		RazonSocial = aRegistro[1];
		salas = Integer.parseInt(aRegistro[2]);
		idDistrito = Integer.parseInt(aRegistro[3]);
		Direccion = aRegistro[4];
		Telefono= aRegistro[5];
		Eliminado=aRegistro[6].equals("true");
		Detalle=aRegistro[7];
		}
	
	public Object[] getRegistro() {
		return new Object[] {idCine,RazonSocial,salas,idDistrito,Direccion,Telefono,Eliminado};
	}
	
	public List<Cine>getRegistros(String[][] mRegistros){
		if(mRegistros == null ) 
			return null;
		
		List<Cine> lstCine = new ArrayList<>();
		for (String [] acine : mRegistros)
			lstCine.add( new Cine (acine));
		
		return lstCine;
	}
}

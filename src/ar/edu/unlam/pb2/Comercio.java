package ar.edu.unlam.pb2;

import java.util.Objects;

public class Comercio {

	@Override
	public int hashCode() {
		return Objects.hash(cuit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comercio other = (Comercio) obj;
		return Objects.equals(cuit, other.cuit);
	}

	private String nombre;
	private Long cuit;
	private final Integer cantidadDeDigitosDeCuit = 11;
	private final String comienzoCuit = "30";

	public Comercio(Long cuit, String nombre) throws CuitInvalidoException {
	this.setNombre(nombre);
	this.setCuit(cuit);
	}

	public String getNombre() {
		return nombre;
	}

	void setNombre(String nombre)  {
		this.nombre = nombre;
	}

	public Long getCuit() {
	
		return cuit;
	}

	protected void setCuit(Long cuit) throws CuitInvalidoException{
		String DigitosDeCuit = cuit.toString();
		if (DigitosDeCuit.length()!= cantidadDeDigitosDeCuit ||DigitosDeCuit.substring(0, 2) ==comienzoCuit) {
			throw new CuitInvalidoException();
		}
		this.cuit = cuit;
	}



}

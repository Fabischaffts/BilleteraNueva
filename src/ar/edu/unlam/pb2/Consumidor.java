package ar.edu.unlam.pb2;

import java.util.Objects;

public class Consumidor implements Comparable{

	private Integer dni;

	private String nombre;

	public Consumidor(Integer dni, String nombre) {
		
		this.dni = dni;
		this.nombre= nombre;
	}

	public Integer getDni() {
		return this.dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consumidor other = (Consumidor) obj;
		return Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public int compareTo(Object o) {
		
		return this.nombre.compareTo(((Consumidor)o).getNombre());
	}
	

}

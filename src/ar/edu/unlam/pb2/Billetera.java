package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Billetera extends MedioDePago {

	private String nombre;
	private Set<Comercio> comercios;
	private Set<Consumidor> consumidores;

	public Billetera(String nombre) {

		this.nombre = nombre;
		// instanciar el objeto por que si no no se puede hacer nada
		this.comercios = new HashSet<>();
		this.consumidores = new TreeSet<>();
	}

	public void agregarComercio(Comercio nuevo) {

		comercios.add(nuevo);
	}

	public Integer getCantidadDeComercios() {

		return this.comercios.size();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Comercio> getComercios() {
		return comercios;
	}

	public void setComercios(Set<Comercio> comercios) {
		this.comercios = comercios;
	}

	public void agregarConsumidor(Consumidor nuevoCo) {
		consumidores.add(nuevoCo);

	}

	public Integer getCantidadDeConsumidores() {
		return this.consumidores.size();

	}

	public void agregarMedioDePago(int dni, MedioDePago nuevo) throws DniInvalidoExepcion, NoCoincideTitularException {

		Consumidor consumidores = buscarConsumidor(dni);
		if (consumidores == null) {
			throw new DniInvalidoExepcion();
		}
		if (!consumidores.getNombre().equalsIgnoreCase(nuevo.getTitular())) {
			throw new NoCoincideTitularException();
		}
		MedioDePago.put(nuevo, dni);

	}

	private Consumidor buscarConsumidor(Integer dni) {
		for (Consumidor actual : consumidores) {
			if (actual.getDni().equals(dni)) {
				return actual;
			}

		}
		return null;
	}

	public Integer getCantidadDeMediosDePago(Integer dni) {
	
	
			return null;
	}
}

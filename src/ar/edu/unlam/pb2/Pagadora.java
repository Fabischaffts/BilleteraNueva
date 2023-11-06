package ar.edu.unlam.pb2;

public interface Pagadora {

	Boolean pagar(Persona vendedor, Double importe);
	void setSaldo(Double saldo);
	Long getNumero();
	String getfechaDeVencimiento();
	Integer getCodigoDeSeguridad();
	String getFechaDeVencimiento();
	String getTitular();
	Double getSaldo();

	


}

package ar.edu.unlam.pb2;

public class TarjetaDeDebito implements Pagadora {

	private Long numero;
	private String titular;
	private String fechaDeVencimiento;
	private Integer codigodeSeguridad;
	private Double saldo;
	private long cantiidaddedigitosrequeriodos =16;
	


	
	public TarjetaDeDebito(Long numero, String titular, String fechaDeVencimiento,
			Integer codigodeSeguridad) throws NumeroDeTarjetaInvalidoException {
//		this.numeroEsperado = numeroEsperado;
//		this.titularEsperado = titularEsperado;
//		this.fechaDevencimientoEsperado = fechaDevencimientoEsperado;
//		this.codigodeSeguridad = codigodeSeguridad;
		this.setSaldo(0.01);
		this.setNumero(numero);
		this.setTiular(titular);
		this.setCodigodeSeguridad(codigodeSeguridad);
		this.setFechaDeVencimiento(fechaDeVencimiento);
				
	}

	private void setFechaDeVencimiento(String fechaDeVencimiento) {
	this.fechaDeVencimiento= fechaDeVencimiento;
		
	}

	private void setCodigodeSeguridad(Integer codigodeSeguridad) {
		this.codigodeSeguridad = codigodeSeguridad;
		
	}

	private void setTiular(String titular) {
		this.titular = titular;
		
		
	}

	private void setNumero(Long numero) throws NumeroDeTarjetaInvalidoException {
	String cantidadDeNumeros = numero.toString();
	if(cantidadDeNumeros.length()!=cantiidaddedigitosrequeriodos)
		throw new NumeroDeTarjetaInvalidoException();
	 this.numero= numero;
	
		
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
		
	}

	@Override
	public Boolean pagar(Persona vendedor, Double importe) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Long getNumero() {
		return this.numero;
		
	}

	@Override
	public String getfechaDeVencimiento() {
		
		return this.fechaDeVencimiento;
	}

	@Override
	public Integer getCodigoDeSeguridad() {
		
		return this.codigodeSeguridad;
	}

	@Override
	public String getTitular() {
		
		return this.titular;
	}


	@Override
	public Double getSaldo() {
		return this.saldo;
	}




	@Override
	public void setSaldo(Double saldo) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public String getFechaDeVencimiento() {
		// TODO Auto-generated method stub
		return null;
	}




}
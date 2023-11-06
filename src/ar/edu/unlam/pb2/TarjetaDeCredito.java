package ar.edu.unlam.pb2;

public class TarjetaDeCredito implements Pagadora {
	private Long numero; 


	public TarjetaDeCredito(Long numero,String titular,String fechaDeVencimiento, Integer codigoDeSeguridad, double LimiteDeCompraEnPesos, double LimiteDeCompraEnDolares) {
	
	
		
		
	}

	private void setNumero(Long numero) throws NumeroDeTarjetaInvalidoExceptio {
		String cantidadDeDigitos = numero.toString();
		
		int canatidadDeNumerosValidos = 16;
		if(cantidadDeDigitos.length() != canatidadDeNumerosValidos ) {
			throw new NumeroDeTarjetaInvalidoExceptio();
		}
		this.setNumero(numero);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean pagar(Persona vendedor, Double importe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSaldo(Double saldo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long getNumero() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getfechaDeVencimiento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getCodigoDeSeguridad() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFechaDeVencimiento() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getTitular() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getSaldo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getLimiteDeCompraEnDolares() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getLimiteDeCompraEnPesos() {
		// TODO Auto-generated method stub
		return 0;
	}


	}
package ar.edu.unlam.pb2;

public class CuentaBancaria extends Cuenta implements Transferible {

	private String cbu;
	private String entidad;
	private String titular;
	private final Integer CantidadDeDigitosEsperado = 20;

	public CuentaBancaria(String cbu, String entidad, String titular) throws CBUInvalidoException {

		this.setCbu( cbu);
		this.entidad= entidad;
		this.titular= titular;
	}
	private void setCbu(String cbu)throws CBUInvalidoException{
		
		if (cbu.length()!= CantidadDeDigitosEsperado) {
			throw new CBUInvalidoException();
		}
		this.cbu= cbu;
	}


	@Override
	public Double getSaldo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void depositar(Double importe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean extraer(Double importe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNumero() {
		// TODO Auto-generated method stub
		return this.cbu;
	}


	@Override
	public String getCbu() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getEntidad() {
		// TODO Auto-generated method stub
		return this.entidad;
	}


	@Override
	public String getTitular() {
		// TODO Auto-generated method stub
		return this.titular;
	}

}

package ar.edu.unlam.pb2;

public class CuentaVirtual extends Cuenta implements Transferible {

	private String cvu;
	private String entidad;
	private String titular;
	private final Integer CantidadDeDigitosEsperado = 23;

	public CuentaVirtual(String cvu, String entidad, String titular) throws CVUInvalidoException {
		
	this.setCvu(cvu); 	
	this.entidad= entidad;
	this.titular= titular;
	}
	private void setCvu(String cvu)throws CVUInvalidoException{
		
		if (cvu.length()!= CantidadDeDigitosEsperado) {
			throw new CVUInvalidoException();
		}
		this.cvu= cvu;
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

	@Override
	public String getNumero() {
		// TODO Auto-generated method stub
		return this.cvu;
	}

}

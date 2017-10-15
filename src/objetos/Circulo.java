package objetos;
import operacoes.VisitorIF;

public class Circulo implements ElementoIF {
	
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}



	public double getRaio() {
		return raio;
	}



	@Override
	public void aceitarVisita(VisitorIF v) {
		v.visitarCirculo(this);
	}

}

package objetos;
import operacoes.VisitorIF;

public class Triangulo implements ElementoIF {
	
	private double ladoA, ladoB, ladoC;
	
	

	public Triangulo(double ladoA, double ladoB, double ladoC) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}



	public double getLadoA() {
		return ladoA;
	}



	public double getLadoB() {
		return ladoB;
	}



	public double getLadoC() {
		return ladoC;
	}



	@Override
	public void aceitarVisita(VisitorIF v) {
		v.visitarTriangulo(this);
	}

}

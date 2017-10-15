package objetos;
import operacoes.VisitorIF;

public class Trapezio implements ElementoIF{
	
	private double baseA, baseB, altura;
	
	

	public Trapezio(double baseA, double baseB, double altura) {
		this.baseA = baseA;
		this.baseB = baseB;
		this.altura = altura;
	}



	public double getBaseA() {
		return baseA;
	}



	public double getBaseB() {
		return baseB;
	}



	public double getAltura() {
		return altura;
	}



	@Override
	public void aceitarVisita(VisitorIF v) {
		v.visitarTrapezio(this);
	}

}

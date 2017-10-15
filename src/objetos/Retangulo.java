package objetos;
import operacoes.VisitorIF;

public class Retangulo implements ElementoIF {
	
	private double largura, altura;
	
	

	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}



	public double getLargura() {
		return largura;
	}



	public double getAltura() {
		return altura;
	}



	@Override
	public void aceitarVisita(VisitorIF v) {
		v.visitarRetangulo(this);
	}

}

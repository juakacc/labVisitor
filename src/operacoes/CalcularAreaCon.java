package operacoes;
import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;

public class CalcularAreaCon implements VisitorIF {

	@Override
	public void visitarRetangulo(Retangulo e) {
		double c =  e.getAltura() * e.getLargura();
		System.out.println("Área: " + c);
	}

	@Override
	public void visitarCirculo(Circulo e) {
		double c = Math.pow(e.getRaio(), 2) * Math.PI;
		System.out.println("Área: " + c);
	}

	@Override
	public void visitarTriangulo(Triangulo e) {
		double p = (e.getLadoA() + e.getLadoB() + e.getLadoC()) / 2;
		
		double c = Math.sqrt(( p * (p - e.getLadoA()) * (p - e.getLadoB()) * (p - e.getLadoC()) ));
		System.out.println("Área: " + c);
	}

	@Override
	public void visitarTrapezio(Trapezio e) {
		double c = (e.getBaseA() + e.getBaseB()) * e.getAltura() / 2;
		System.out.println("Área: " + c);
	}
}
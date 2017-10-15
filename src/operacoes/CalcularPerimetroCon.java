package operacoes;

import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;

public class CalcularPerimetroCon implements VisitorIF {

	@Override
	public void visitarRetangulo(Retangulo e) {
		System.out.println("Perimetro: " + (e.getAltura()*2 + e.getLargura()*2));
	}

	@Override
	public void visitarCirculo(Circulo e) {
		double c = 2 * e.getRaio() * Math.PI;
		System.out.println("Perimetro: " + c);
	}

	@Override
	public void visitarTriangulo(Triangulo e) {
		System.out.println("Perimetro: " + (e.getLadoA() + e.getLadoB() + e.getLadoC()));
	}

	@Override
	public void visitarTrapezio(Trapezio e) {
		double ladoA = Math.abs(e.getBaseA() - e.getBaseB()) / 2;
		ladoA = Math.sqrt(Math.pow(e.getAltura(), 2) + Math.pow(ladoA, 2));
		
		double peri = ladoA * 2 + e.getBaseA() + e.getBaseB();
		
		System.out.println("Perimetro: " + peri);
	}

}

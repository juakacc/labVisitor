package operacoes;

import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;

public class MaximizarCon implements VisitorIF {

	@Override
	public void visitarRetangulo(Retangulo e) {
		System.out.println("Novas medidas -> Largura: " + e.getLargura() * 2 + " Altura: " + e.getAltura() * 2);
	}

	@Override
	public void visitarCirculo(Circulo e) {
		System.out.println("Novas medidas -> Raio: " + e.getRaio() * 2);
	}

	@Override
	public void visitarTriangulo(Triangulo e) {
		System.out.println("Novas medidas -> LadoA: " + e.getLadoA() * 2 + " LadoB: " + e.getLadoB() * 2 + " LadoC: " + e.getLadoC() * 2);
	}

	@Override
	public void visitarTrapezio(Trapezio e) {
		System.out.println("Novas medidas -> Altura: " + e.getAltura()*2 + " BaseA: " + e.getBaseA()*2 + " BaseB: " + e.getBaseB()*2);
	}
}
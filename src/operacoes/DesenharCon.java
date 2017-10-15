package operacoes;
import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;

public class DesenharCon implements VisitorIF {

	@Override
	public void visitarRetangulo(Retangulo e) {
		System.out.println("Desenhando Retangulo...");
	}

	@Override
	public void visitarCirculo(Circulo e) {
		System.out.println("Desenhando Círculo...");
	}

	@Override
	public void visitarTriangulo(Triangulo e) {
		System.out.println("Desenhando Triângulo...");
	}

	@Override
	public void visitarTrapezio(Trapezio e) {
		System.out.println("Desenhando Trapezio...");
	}
}
import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;
import operacoes.CalcularAreaCon;
import operacoes.CalcularPerimetroCon;
import operacoes.DesenharCon;
import operacoes.MaximizarCon;
import operacoes.VisitorIF;

public class Main {
	
	public static void main(String[] args) {
		VisitorIF v1 = new CalcularAreaCon();
		VisitorIF v2 = new CalcularPerimetroCon();
		VisitorIF v3 = new DesenharCon();
		VisitorIF v4 = new MaximizarCon();
				
		Retangulo retangulo = new Retangulo(10, 5);
		Circulo circulo = new Circulo(10);
		Triangulo triangulo = new Triangulo(10, 8, 6);
		Trapezio trapezio = new Trapezio(10, 6, 5);
		
		System.out.println("--- Retângulo ---");
		retangulo.aceitarVisita(v1);
		retangulo.aceitarVisita(v2);
		retangulo.aceitarVisita(v3);
		retangulo.aceitarVisita(v4);
		
		System.out.println("\n--- Circulo ---");
		circulo.aceitarVisita(v1);
		circulo.aceitarVisita(v2);
		circulo.aceitarVisita(v3);
		circulo.aceitarVisita(v4);
		
		System.out.println("\n--- Triângulo ---");
		triangulo.aceitarVisita(v1);
		triangulo.aceitarVisita(v2);
		triangulo.aceitarVisita(v3);
		triangulo.aceitarVisita(v4);
		
		System.out.println("\n--- Trapézio ---");
		trapezio.aceitarVisita(v1);
		trapezio.aceitarVisita(v2);
		trapezio.aceitarVisita(v3);
		trapezio.aceitarVisita(v4);
	}
}
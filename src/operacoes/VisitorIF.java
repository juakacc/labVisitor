package operacoes;
import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;

public interface VisitorIF {

	public void visitarRetangulo(Retangulo e);
	
	public void visitarCirculo(Circulo e);
	
	public void visitarTriangulo(Triangulo e);
	
	public void visitarTrapezio(Trapezio e);
}

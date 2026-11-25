import java.lang.Math;

public class MainFigura {
    public static void main() {
        Retangulo retangulo = new Retangulo(2, 4);
        Quadrado quadrado = new Quadrado(5);
        Circulo circulo = new Circulo(3);

        // FUNÇÃO LAMBDA
        FiguraGeometrica areaRetangulo = () -> retangulo.getBase() * retangulo.getAltura();
        FiguraGeometrica areaQuadrado = () -> quadrado.getLado() * quadrado.getLado();
        FiguraGeometrica areaCirculo = () -> (circulo.getRaio() * circulo.getRaio()) * Math.PI;

        System.out.println("área do retângulo: " + areaRetangulo.calcularArea());
        System.out.println("área do quadrado: "+areaQuadrado.calcularArea());
        System.out.println("área do círculo: "+areaCirculo.calcularArea());
    }
}

package figurapolimorfismoconstructores;

public class FigurasPolimorfismoConstructores
{

    public static void main(String[] args)
    {
        Figura Circulo = new Figura(Figura.Tipo.CIRCULO, 10);

        System.out.println("El área del círculo es = " + Circulo.area());

        Figura Cuadrado = new Figura(Figura.Tipo.CUADRADO, 10);

        System.out.println("El área del cuadrado es = " + Cuadrado.area());

        Figura Triangulo = new Figura(Figura.Tipo.TRIANGULO, 15, 7);

        System.out.println("El area del triangulo es = " + Triangulo.area());

        Figura Rectangulo = new Figura(Figura.Tipo.RECTANGULO, 10, 15);
    }
}
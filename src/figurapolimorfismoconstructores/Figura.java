package figurapolimorfismoconstructores;

// superclase

class Figura{

    enum Tipo {

        CUADRADO,

        CIRCULO,
        TRIANGULO,
        RECTANGULO

    }

    protected double length, height, base;

    Tipo figura_tipo;

    Figura(Tipo figura, double length){

        this.length = length;

        this.figura_tipo = figura;

    }

    Figura(Tipo figura, double height, double base){

        this.height = height;

        this.base = base;

        this.figura_tipo = figura;

    }

    double area(){

        double area = 0;

        switch (figura_tipo)

        {

            case CUADRADO:

                area = length * length;

                break;

            case CIRCULO:

                area = 3.14 * length * length;

                break;

            case TRIANGULO:
                area = (base * height) / 2;

                break;

            case RECTANGULO:
                area = length * height;
                break;

        }

        return area;

    }
}
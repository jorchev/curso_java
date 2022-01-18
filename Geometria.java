public class Geometria {
    
    public static void main(String[] args){

        System.out.println("--- Area de un cuadrado -------------------------");
        int lado = 7;
        int resCuadrado = lado*lado;
        System.out.println("El resultado es: " + resCuadrado);

        System.out.println("--- Area de un circulo --------------------------");
        int radio = 5;
        double resCirculo = Math.PI * Math.pow(radio,2);
        System.out.println("El resultado es: " + resCirculo);
        System.out.println("--- Area de un rectangulo -----------------------");
        int ancho = 10;
        int alto = 6;
        int resRectangulo = ancho * alto;
        System.out.println("El resultado es: " + resRectangulo);
        System.out.println("--- Area de un triangulo ------------------------");
        int base = 5;
        int altura = 16;
        int resTriangulo = (base * altura)/2;
        System.out.println("El resultado es: " + resTriangulo);

    }

}

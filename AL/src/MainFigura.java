public class MainFigura {
    public static void main(String[] args) {
        Figura cuadrado = new Cuadrado(5);
        System.out.println("Área del cuadrado: " + cuadrado.area());
        System.out.println("Perímetro del cuadrado: " + cuadrado.perimetro());

        Figura rectangulo = new Rectangulo(4, 6);
        System.out.println("Área del rectángulo: " + rectangulo.area());
        System.out.println("Perímetro del rectángulo: " + rectangulo.perimetro());
    }
}

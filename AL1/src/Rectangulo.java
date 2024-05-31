class Rectangulo extends Figura {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    double area() {
        return ancho * alto;
    }

    @Override
    double perimetro() {
        return 2 * (ancho + alto);
    }
}

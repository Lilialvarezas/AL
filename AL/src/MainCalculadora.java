public class MainCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int suma = calculadora.sumar(2, 3);
        System.out.println("El resultado de la suma es : " + suma);

        int resta = calculadora.restar(5, 2);
        System.out.println("El resultaod de la resta es: " + resta);

        int multiplicacion = calculadora.multiplicar(4, 5);
        System.out.println("el resultado de la multiplicación es: " + multiplicacion);

        try {
            int division = calculadora.dividir(10, 2);
            System.out.println("El resultado de la división es: " + division);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
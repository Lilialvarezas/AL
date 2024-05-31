public class ManejadorDatos {
    private BaseDatos baseDatos;

    public ManejadorDatos(BaseDatos baseDatos) {
        this.baseDatos = baseDatos;
    }

    public void procesar(String datos) {
        baseDatos.guardar(datos);
        String resultado = baseDatos.leer();
        System.out.println("Datos leídos: " + resultado);
    }
}

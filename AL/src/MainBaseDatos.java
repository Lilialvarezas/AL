public class MainBaseDatos {
    public static void main(String[] args) {
        BaseDatos mysql = new MySQL();
        BaseDatos mongodb = new MongoDB();

        ManejadorDatos manejadorMySQL = new ManejadorDatos(mysql);
        ManejadorDatos manejadorMongoDB = new ManejadorDatos(mongodb);

        manejadorMySQL.procesar("MySQL");
        manejadorMongoDB.procesar(" MongoDB");
    }
}

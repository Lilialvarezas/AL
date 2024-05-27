public class MySQL implements BaseDatos {
    @Override
    public void guardar(String datos) {
        System.out.println("Guardando algo en la BD de MySQL: " + datos);
    }

    @Override
    public String leer() {
        System.out.println("Leyendo algo en la BD de MySQL");
        return "Lo que devolveria MySQL";
    }
}

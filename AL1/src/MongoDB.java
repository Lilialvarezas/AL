public class MongoDB implements BaseDatos {
    @Override
    public void guardar(String datos) {
        System.out.println("Guardando algo en la BD de MongoDB: " + datos);

    }

    @Override
    public String leer() {
        System.out.println("Leyendo algo en la BD de MongoDB");
        return "Lo que devolveria Mongo";
    }
}


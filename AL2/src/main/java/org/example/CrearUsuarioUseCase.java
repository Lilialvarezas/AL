package org.example;

public class CrearUsuarioUseCase {
    private UserDatabaseAdapter userDatabaseAdapter;

    public CrearUsuarioUseCase(UserDatabaseAdapter userDatabaseAdapter) {
        this.userDatabaseAdapter = userDatabaseAdapter;
    }

    public User crearUsuario(int id, String nombre, String correoElectronico, String contrasena) {
        User nuevoUsuario = new User(id, nombre, correoElectronico, contrasena);
        userDatabaseAdapter.createUser(nuevoUsuario);
        return nuevoUsuario;
    }
}

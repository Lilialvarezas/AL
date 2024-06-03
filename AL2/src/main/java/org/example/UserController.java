package org.example;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UserController {
    private CrearUsuarioUseCase crearUsuarioUseCase;
    private UserDatabaseAdapter userDatabaseAdapter;

    public UserController() {
        this.userDatabaseAdapter = new UserDatabaseAdapterImpl();
        this.crearUsuarioUseCase = new CrearUsuarioUseCase(userDatabaseAdapter);
    }

    @PostMapping
    public User crearUsuario(@RequestParam int id, @RequestParam String nombre,
                             @RequestParam String correoElectronico, @RequestParam String contrasena) {
        return crearUsuarioUseCase.crearUsuario(id, nombre, correoElectronico, contrasena);
    }

    @GetMapping("/{id}")
    public User obtenerUsuario(@PathVariable int id) {
        return userDatabaseAdapter.getUser(id);
    }

    @PutMapping("/{id}")
    public User actualizarUsuario(@PathVariable int id, @RequestParam String nombre,
                                  @RequestParam String correoElectronico, @RequestParam String contrasena) {
        User usuario = new User(id, nombre, correoElectronico, contrasena);
        userDatabaseAdapter.updateUser(usuario);
        return usuario;
    }

    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable int id) {
        userDatabaseAdapter.deleteUser(id);
    }
}


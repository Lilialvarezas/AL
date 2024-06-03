package org.example;

import java.util.HashMap;
import java.util.Map;

public class UserDatabaseAdapterImpl implements UserDatabaseAdapter {
    private Map<Integer, User> database;
    private int currentId;

    public UserDatabaseAdapterImpl() {
        this.database = new HashMap<>();
        this.currentId = 1; // Empezamos con ID 1
    }

    public int getNextId() {
        return currentId++;
    }

    @Override
    public void createUser(User user) {
        database.put(user.getId(), user);
        System.out.println("Usuario creado: " + user);
    }

    @Override
    public User getUser(int id) {
        User user = database.get(id);
        if (user != null) {
            System.out.println("Usuario encontrado: " + user);
        } else {
            System.out.println("Usuario no encontrado");
        }
        return user;
    }

    @Override
    public void updateUser(User user) {
        if (database.containsKey(user.getId())) {
            database.put(user.getId(), user);
            System.out.println("Usuario actualizado: " + user);
        } else {
            System.out.println("Usuario no encontrado para actualizar");
        }
    }

    @Override
    public void deleteUser(int id) {
        User removedUser = database.remove(id);
        if (removedUser != null) {
            System.out.println("Usuario eliminado: " + removedUser);
        } else {
            System.out.println("Usuario no encontrado para eliminar");
        }
    }
}


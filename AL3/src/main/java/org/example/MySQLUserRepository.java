package org.example;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MySQLUserRepository implements UserRepository {
    private Map<Integer, UserEntity> database;

    public MySQLUserRepository() {
        this.database = new HashMap<>();
        // Simulamos algunos usuarios en la "base de datos"
        database.put(1, UserEntityFactory.createUserEntity(1, "Liliana Alvarez", "lili.alva@netec.com", "password789"));
        database.put(2, UserEntityFactory.createUserEntity(2, "Rodrigo Silva", "rodri.silva@netec.com", "password321"));
    }

    @Override
    public UserEntity findUserById(int id) {
        // Simulación de consulta a la base de datos
        return database.get(id);
    }
}


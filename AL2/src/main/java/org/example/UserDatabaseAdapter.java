package org.example;

public interface UserDatabaseAdapter {
    void createUser(User user);
    User getUser(int id);
    void updateUser(User user);
    void deleteUser(int id);
}

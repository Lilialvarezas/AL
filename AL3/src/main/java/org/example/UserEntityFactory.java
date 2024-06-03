package org.example;

public class UserEntityFactory {
    public static UserEntity createUserEntity(int id, String name, String email, String pwd) {
        return new UserEntity(id, name, email, pwd);
    }
}

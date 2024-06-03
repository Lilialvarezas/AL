package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity getUser(int id) {
       return userRepository.findUserById(id);
      //  return new User(userEntity.getId(), userEntity.getNombre(), userEntity.getCorreoElectronico(), userEntity.getContrasena());
    }
}

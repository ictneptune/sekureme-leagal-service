package com.sekureme.legal.service;



import com.sekureme.legal.model.UserDTO;
import java.util.List;
import java.util.UUID;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);
    UserDTO getUserById(UUID userId);
    List<UserDTO> getAllUsers();
    UserDTO updateUser(UUID userId, UserDTO userDTO);
    void deleteUser(UUID userId);
}
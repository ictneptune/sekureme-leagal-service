package com.sekureme.legal.service;


import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sekureme.legal.model.User;
import com.sekureme.legal.model.UserDTO;
import com.sekureme.legal.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User user = new User();
        // Set user properties from userDTO
        user = userRepository.save(user);
        return convertToDTO(user);
    }

    @Override
    public UserDTO getUserById(UUID userId) {
        User user = userRepository.findById(userId).orElse(null);
        return convertToDTO(user);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @Override
    public UserDTO updateUser(UUID userId, UserDTO userDTO) {
        User user = userRepository.findById(userId).orElse(null);
        // Update user properties from userDTO
        user = userRepository.save(user);
        return convertToDTO(user);
    }

    @Override
    public void deleteUser(UUID userId) {
        userRepository.deleteById(userId);
    }

    private UserDTO convertToDTO(User user) {
        UserDTO userDTO = new UserDTO();
        // Set userDTO properties from user
        return userDTO;
    }
}
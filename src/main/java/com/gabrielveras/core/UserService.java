package com.gabrielveras.core;

public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void createUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }

        boolean emailExists = repository.findAll().stream().anyMatch(u -> u.getEmail().equalsIgnoreCase(user.getEmail()));

        if (emailExists) {
            throw new IllegalArgumentException("Email already exists");
        }

        repository.add(user);
    }

    public User findById(Long id){
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("User not found"));
    }

    public java.util.List<User> listUsers() {
        return repository.findAll();
    }
            
}

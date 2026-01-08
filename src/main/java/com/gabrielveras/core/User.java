package com.gabrielveras.core;

import java.util.Objects;

public class User {

    // Atributos encapsulados.
    private final Long id;
    private String name;
    private String email;
    private int age;

    // Construtor
    public User(Long id, String name, String email, int age) {
        if (id == null) {
            throw new IllegalArgumentException("Id cannot be null");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email cannot be null or blank");
        }
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be granter than zero");
        }

        this.id = id;
        this.name = name;
        this.email = email;
        this.email = email;
        this.age = age;

    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    // Equals e HasCode
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "User {" + "id=" + id + ", name='" + name + '\'' + ", email='" + email + '\'' + ", age=" + age + '}';
    }

}

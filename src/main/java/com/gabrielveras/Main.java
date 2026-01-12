package com.gabrielveras;

import com.gabrielveras.core.User;
import com.gabrielveras.core.UserRepository;
import com.gabrielveras.core.UserService;

/**
 * Classe responsável por simular o uso da aplicação
 * e demonstrar o fluxo entre Repository, Service e Entity.
 */

public class Main {
public static void main (String[] args) {
    
    UserRepository repository = new UserRepository();
    UserService service = new UserService(repository);

    User user1 = new User(1L, "Gabriel", "gabriel@hotmail.com", 24);
    User user2 = new User(2L, "Laura", "laura@hotmail.com", 22);

    service.createUser(user1);
    service.createUser(user2);

    System.out.println("Usuários Cadastrados");
    service.listUsers().forEach(System.out::println);

    System.out.println("Buscando usuário por ID:");
    System.out.println(service.findById(1L));
    
    }
}
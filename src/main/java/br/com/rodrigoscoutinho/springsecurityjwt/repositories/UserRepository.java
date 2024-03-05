package br.com.rodrigoscoutinho.springsecurityjwt.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import br.com.rodrigoscoutinho.springsecurityjwt.entity.User;

public interface UserRepository extends CrudRepository<User, String> {

    Optional<User> findByUsername(String username);
}

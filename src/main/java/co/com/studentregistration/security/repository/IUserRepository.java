package co.com.studentregistration.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.studentregistration.security.entity.User;

public interface IUserRepository extends JpaRepository<User, Integer>{

	Optional<User> findByUsername(String username);
    boolean existsByUsername(String username);
}

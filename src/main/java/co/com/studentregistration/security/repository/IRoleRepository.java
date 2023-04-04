package co.com.studentregistration.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.studentregistration.security.entity.Role;
import co.com.studentregistration.security.entity.RoleEnum;

public interface IRoleRepository extends JpaRepository<Role, Integer>{

	 Optional<Role> findByRoleName(RoleEnum roleName);
}

package co.com.studentregistration.security.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.studentregistration.security.entity.Role;
import co.com.studentregistration.security.entity.RoleEnum;
import co.com.studentregistration.security.repository.IRoleRepository;

@Service
@Transactional
public class RoleService {

	@Autowired
	private IRoleRepository roleRepository;

	public Optional<Role> getByRoleName(RoleEnum roleName) {
		return roleRepository.findByRoleName(roleName);
	}
}

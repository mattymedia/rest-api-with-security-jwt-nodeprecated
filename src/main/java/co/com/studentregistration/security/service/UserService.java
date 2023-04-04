package co.com.studentregistration.security.service;

import java.util.Optional;

import javax.transaction.Transactional;

import co.com.studentregistration.security.entity.User;
import co.com.studentregistration.security.repository.IUserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {
	
	@Autowired
    private IUserRepository userRepository;

    public Optional<User> getByUsername(String username){
        return userRepository.findByUsername(username);
    }
    
    public boolean existByUsername(String username){
        return userRepository.existsByUsername(username);
    }
    
    public void save(User user){
        userRepository.save(user);
    }
    
}

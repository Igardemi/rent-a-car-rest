package com.kings.rentacarrest.core.services;

import com.kings.rentacarrest.core.exception.DefaultException;
import com.kings.rentacarrest.model.dto.UserLogInDTO;
import com.kings.rentacarrest.persistence.entity.User;
import com.kings.rentacarrest.persistence.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ImplUserService implements IUserService {

    private final UserRepository userRepository;

    @Override
    public List<User> findAllUser() { return this.userRepository.findAll(); }

    @Override
    public User findUserById(Long id) throws DefaultException {
        val optionalUser = this.userRepository.findById(id);
        optionalUser.orElseThrow(() -> new DefaultException("User not found", HttpStatus.NO_CONTENT));
        return optionalUser.get();
    }

    @Override
    public boolean deleteUser(Long id) throws DefaultException {
        this.findUserById(id);
        this.userRepository.deleteById(id);
        return true;
    }

    @Override
    public void updateUser(User user) throws DefaultException {
        this.userRepository.saveAndFlush(user);
    }

    public User authUser(UserLogInDTO user) throws DefaultException {

        User userCurrent =  this.userRepository.findByEmail(user.getEmail());

        if (userCurrent == null) {
            throw new DefaultException("User not found", HttpStatus.NO_CONTENT);
        }

        String pass = user.getEmail();
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        if(!encoder.matches(pass,userCurrent.getPassword())){
            throw new DefaultException("Incorrect password", HttpStatus.NO_CONTENT);
        }
        return userCurrent;
    }

}

package com.example.finale.service.jwt.user;

import com.example.finale.dto.SignupDTO;
import com.example.finale.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserDTO createUser(SignupDTO signupDTO);
    boolean hasUserWithEmail(String email);

}

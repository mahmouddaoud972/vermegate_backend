
package com.example.finale.controller;

import com.example.finale.dto.SignupDTO;
import com.example.finale.dto.UserDTO;
import com.example.finale.service.jwt.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SignupController {

    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "http://localhost:4200")

    @PostMapping("/sign-up")
    public ResponseEntity<?> signupUser(@RequestBody SignupDTO signupDTO) {


        if (userService.hasUserWithEmail(signupDTO.getEmail().toString())) {
            return new ResponseEntity<>("User already exist", HttpStatus.NOT_ACCEPTABLE);
        }
         UserDTO createUser = userService.createUser(signupDTO);
        if (createUser == null) {
            return new ResponseEntity<>("user not created , Come later !" , HttpStatus.BAD_REQUEST);
        }
        return  new ResponseEntity<>(createUser,HttpStatus.CREATED);


    }
}

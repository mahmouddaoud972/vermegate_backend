
package com.example.finale.entities;


import com.example.finale.dto.UserDTO;
import com.example.finale.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data

@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;
    private UserRole userRole;
    private byte[] img;

}

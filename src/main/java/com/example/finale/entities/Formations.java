package com.example.finale.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import java.util.List;

@Entity
@Data
@Table(name = "formations")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Formations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(name= "body",length=512)
    private String body;
/**
     private List<String> tags;

     @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "user_id",nullable = false)
     @OnDelete(action = OnDeleteAction.CASCADE)
   @JsonIgnore
    private User user;
   **/
}

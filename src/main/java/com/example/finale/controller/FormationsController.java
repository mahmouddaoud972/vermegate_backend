package com.example.finale.controller;


import com.example.finale.entities.Formations;
import com.example.finale.service.jwt.formations.FormationServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FormationsController {
    private final FormationServiceImpl formationService;

    public  FormationsController(FormationServiceImpl formationService){
        this.formationService = formationService;
    }

    /**
   @PostMapping("/formation")
   public ResponseEntity<?> postFormation(@RequestBody FormationDto formationDto){
        FormationDto createdFormationDto = formationService.addFormation(formationDto);
        if(createdFormationDto == null){
            return new ResponseEntity<>("somthing went wrong", HttpStatus.BAD_REQUEST);
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(createdFormationDto);
    }
   **/

    @GetMapping("/formations")
    public List<Formations> getAllFormations() {
        return formationService.getFormations();
    }

}


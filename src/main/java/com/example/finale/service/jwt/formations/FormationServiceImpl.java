package com.example.finale.service.jwt.formations;


import com.example.finale.entities.Formations;
import com.example.finale.repository.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service

public class FormationServiceImpl {

    private final FormationRepository formationsRepository;

    public FormationServiceImpl(FormationRepository formationsRepository) {
        this.formationsRepository = formationsRepository;
    }

    public Formations addFormation(Formations formations) {
        return formationsRepository.save(formations);
    }

    public List<Formations> getFormations() {
        return formationsRepository.findAll();
    }

    public Optional<Formations> getFormationByID(Long id) {
        return formationsRepository.findById(id);
    }

    public void deleteFormation(Long id) {
        formationsRepository.deleteById(id);
    }

    /**
   private final UserRepository userRepository;
   private final FormationRepository formationRepository;
    private static final Logger logger = LoggerFactory.getLogger(FormationServiceImpl.class);


    public FormationServiceImpl(UserRepository userRepository, FormationRepository formationRepository) {
        this.userRepository = userRepository;
        this.formationRepository = formationRepository;
    }

    @Override
    public FormationDto addFormation(FormationDto formationDto) {
        logger.info("Méthode addFormation() appelée avec les données : " + formationDto);

        //Optional<User> optionalUser = userRepository.findById(formationDto.getUserId());
       //if (optionalUser.isPresent()){
           Formations formation = new Formations();
           formation.setTitle(formationDto.getTitle());
           formation.setBody(formationDto.getBody());
         //  formation.setTags(formationDto.getTags());
           Formations createdFormation = formationRepository.save(formation);
           FormationDto createdFormationDto = new FormationDto();
           createdFormationDto.setId(createdFormation.getId());
           createdFormationDto.setTitle(createdFormation.getTitle());
           return createdFormationDto;




      // }
      //  return null;
    }
    **/

}

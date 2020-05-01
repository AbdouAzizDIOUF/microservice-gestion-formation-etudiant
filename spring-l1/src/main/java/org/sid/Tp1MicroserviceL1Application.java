package org.sid;

import org.sid.entities.Etudiant;
import org.sid.entities.Formation;
import org.sid.repository.EtudiantRepository;
import org.sid.repository.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;

@SpringBootApplication
@CrossOrigin("*")
public class Tp1MicroserviceL1Application implements CommandLineRunner {

    @Autowired
    private EtudiantRepository etudiantRepository;

    @Autowired
    private FormationRepository formationRepository;

    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(Tp1MicroserviceL1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        repositoryRestConfiguration.exposeIdsFor(Formation.class, Etudiant.class); // expose le $id

        Formation f1 = formationRepository.save(new Formation(null, "PHP/SYMFONY 4", 30, null));
        Formation f2 = formationRepository.save(new Formation(null, "PHP/LARAVEL 6", 30, null));
        Formation f3 = formationRepository.save(new Formation(null, "JS/ANGULAR", 30, null));
        Formation f4 = formationRepository.save(new Formation(null, "JAVA JEE/SPRING", 30, null));

        etudiantRepository.save(new Etudiant(null,"DIOUF", "Mame Abdou", new Date(), f1));
        etudiantRepository.save(new Etudiant(null,"DIOUF", "Mame Abdou", new Date(), f1));
        etudiantRepository.save(new Etudiant(null,"DIOUF", "Mame Abdou", new Date(), f2));
        etudiantRepository.save(new Etudiant(null,"DIOUF", "Mame Abdou", new Date(), f2));
        etudiantRepository.save(new Etudiant(null,"DIOUF", "Mame Abdou", new Date(), f2));
        etudiantRepository.save(new Etudiant(null,"DIOUF", "Mame Abdou", new Date(), f4));
        etudiantRepository.save(new Etudiant(null,"DIOUF", "Mame Abdou", new Date(), f4));
        etudiantRepository.save(new Etudiant(null,"DIOUF", "Mame Abdou", new Date(), f4));
    }
}

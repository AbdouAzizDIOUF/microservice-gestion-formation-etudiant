package org.sid.repository;

import org.sid.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

//@CrossOrigin("http://localhost:4200")
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    public List<Etudiant> findByNomContains(String nom);
}

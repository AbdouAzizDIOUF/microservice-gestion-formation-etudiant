package org.sid.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data // getters et setters
@NoArgsConstructor // constructeur sans paramettre
@AllArgsConstructor // constructeur avec paramettre
public class Etudiant implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    @ManyToOne
    @JoinColumn(name = "ID_FORMATION")
    private Formation formation;

}

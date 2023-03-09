package tn.esprit.kaddem.DAO.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode

//@Data remplace @getter, setter tostring et equals

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;

    private String prenomE;

    private String nomE;

    @Enumerated(EnumType.STRING)
    private Domaine domaine;

    @ManyToOne
    @JsonIgnore
    Departement departement = null;

    @ManyToMany(mappedBy = "etudiants")
    @JsonIgnore
    private List<Equipe> equipes = null;

    @OneToMany(mappedBy = "etudiant")
    @JsonIgnore
    List<Contrat> contrats = null;
}
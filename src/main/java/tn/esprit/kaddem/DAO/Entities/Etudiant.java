package tn.esprit.kaddem.DAO.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
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
    Departement departement;

    @ManyToMany(mappedBy = "etudiants")
    private List<Equipe> equipes;

    @OneToMany(mappedBy = "etudiant")
    List<Contrat> contrats;
}
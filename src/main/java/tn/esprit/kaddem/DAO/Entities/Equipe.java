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
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipe;

    private String nomEquipe;

    @Enumerated(EnumType.STRING)
    private Niveau niveau;

    @ManyToMany
    private List<Etudiant> etudiants;
    @OneToOne
    private DetailsEquipe detailsEquipe;
}
package tn.esprit.kaddem.DAO.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class DetailsEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailsEquipe;

    private int salle;

    private String thematique;

    @OneToOne(mappedBy = "detailsEquipe")
    private Equipe equipe;

}
package tn.esprit.kaddem.DAO.Entities;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idContrat;

    @Temporal(TemporalType.DATE)
    Date dateDebut;

    @Temporal(TemporalType.DATE)
    Date dateFin;

    @Enumerated(EnumType.STRING)
    Specialite specialite;

    boolean archive;
    float montant;

    @Transient
    float salaire;

    @ManyToOne
    Etudiant etudiant;

}

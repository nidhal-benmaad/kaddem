package tn.esprit.kaddem.DAO.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idDepartment;

    private String nomDepartement;

    @OneToMany(mappedBy = "departement", cascade = CascadeType.REMOVE)
    @JsonIgnore
    private List<Etudiant> etudiants;

}
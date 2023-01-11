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
public class Universite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idUniveriste;

    private String nomUniversite;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Departement> departements;

}
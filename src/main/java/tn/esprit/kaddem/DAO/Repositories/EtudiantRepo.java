package tn.esprit.kaddem.DAO.Repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.kaddem.DAO.Entities.Etudiant;

@Repository
public interface EtudiantRepo extends CrudRepository<Etudiant,Long> {

    @Query("select e from Etudiant e where e.idEtudiant=:idEtudiant")
    Etudiant getEtudiantById(@Param("idEtudiant") Long idEtudiant);

}

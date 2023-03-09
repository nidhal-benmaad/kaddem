package tn.esprit.kaddem.DAO.Repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.kaddem.DAO.Entities.Etudiant;
import tn.esprit.kaddem.DAO.Entities.Universite;

@Repository
public interface UniversiteRepo extends CrudRepository<Universite,Long> {

    @Query("select u from Universite u where u.idUniveriste=:idUniversite")
    Universite getUniversiteById(@Param("idUniversite") Long idUniversite);

}

package tn.esprit.kaddem.DAO.Repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.kaddem.DAO.Entities.Equipe;

@Repository
public interface EquipeRepo extends CrudRepository<Equipe,Long> {
    @Query("select e from Equipe e where e.idEquipe=:idEquipe")
    Equipe getEquipeById(@Param("idEquipe") Long idEquipe);

}

package tn.esprit.kaddem.DAO.Repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.kaddem.DAO.Entities.Contrat;
import tn.esprit.kaddem.DAO.Entities.Specialite;

import java.util.Date;
import java.util.List;

@Repository
public interface ContactRepo extends CrudRepository<Contrat,Long> {

    // keyword
    List<Contrat> getContratsBySpecialite(Specialite specialite);

    //JPQL
    @Query("select c from Contrat c where c.archive=:arch")
    List<Contrat> filterByArchive(@Param(value = "arch") boolean archive);// order of parameter is not important

    @Query(value="select * from contrats where date_debut > ?1 and date_fin < ?1" ,nativeQuery = true)
    List<Contrat> getContratsBetweenDates(Date date);
}

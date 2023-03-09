package tn.esprit.kaddem.DAO.Repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.kaddem.DAO.Entities.Departement;
import tn.esprit.kaddem.DAO.Entities.Etudiant;

@Repository
public interface DepartementRepo extends CrudRepository<Departement,Long> {

    @Query("select d from Departement d where d.idDepartment=:idDepartement")
    Departement getDepartementById(@Param("idDepartement") Long idDepartemnt);
}

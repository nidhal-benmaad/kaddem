package tn.esprit.kaddem.Services;

import tn.esprit.kaddem.DAO.Entities.Departement;
import tn.esprit.kaddem.DAO.Entities.Etudiant;

import java.util.List;

public interface IDepartementService {
    List<Departement> retrieveAllDepartements();
    Departement addDepartement (Departement d);
    Departement updateDepartement (Departement d);
    Departement retrieveDepartement (Integer idDepart);
    void assignUniversiteToDepartement(Long idUniversite, Long departementId);
}

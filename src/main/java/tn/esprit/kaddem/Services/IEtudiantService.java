package tn.esprit.kaddem.Services;

import tn.esprit.kaddem.DAO.Entities.Contrat;
import tn.esprit.kaddem.DAO.Entities.Etudiant;
import tn.esprit.kaddem.DAO.Entities.Specialite;

import java.util.Date;
import java.util.List;

public interface IEtudiantService {
    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant(Etudiant e);

    Etudiant updateEtudiant(Etudiant e);

    Etudiant retrieveEtudiant(Integer idEtudiant);

    void removeEtudiant(Integer idEtudiant);

    void assignEtudiantToDepartement(Long etudiantId, Long departementId);

    Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Long idContrat, Long idEquipe);
}

package tn.esprit.kaddem.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.kaddem.DAO.Entities.*;
import tn.esprit.kaddem.DAO.Repositories.ContactRepo;
import tn.esprit.kaddem.DAO.Repositories.DepartementRepo;
import tn.esprit.kaddem.DAO.Repositories.EquipeRepo;
import tn.esprit.kaddem.DAO.Repositories.EtudiantRepo;

import java.util.Date;
import java.util.List;


@Service
public class EtudiantService implements IEtudiantService {
    @Autowired
    private EtudiantRepo etudiantRepo;
    @Autowired
    private DepartementRepo departementRepo;
    @Autowired
    private EquipeRepo equipeRepo;

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return (List<Etudiant>) etudiantRepo.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepo.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return null;
    }

    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {
        return null;
    }

    @Override
    public void removeEtudiant(Integer idEtudiant) {

    }

    @Override
    public void assignEtudiantToDepartement(Long etudiantId, Long departementId) {
        try {
            Etudiant etu = etudiantRepo.getEtudiantById(etudiantId);
            Departement departement = departementRepo.getDepartementById(departementId);
            etu.setDepartement(departement);
            etudiantRepo.save(etu);
        }  catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Error >>>" + e);
        }


    }

    @Override
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Long idContrat, Long idEquipe) {

        Equipe equipe = equipeRepo.findById(idEquipe).orElse(null);


        return null;
    }
}

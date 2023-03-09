package tn.esprit.kaddem.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.kaddem.DAO.Entities.Departement;
import tn.esprit.kaddem.DAO.Entities.Etudiant;
import tn.esprit.kaddem.DAO.Entities.Universite;
import tn.esprit.kaddem.DAO.Repositories.DepartementRepo;
import tn.esprit.kaddem.DAO.Repositories.EtudiantRepo;
import tn.esprit.kaddem.DAO.Repositories.UniversiteRepo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Service
public class DepartementService implements IDepartementService {
    @Autowired
    private DepartementRepo departementRepo;
    @Autowired
    private UniversiteRepo universiteRepo;

    @Override
    public List<Departement> retrieveAllDepartements() {
        return null;
    }

    @Override
    public Departement addDepartement(Departement d) {
        return departementRepo.save(d);
    }

    @Override
    public Departement updateDepartement(Departement d) {
        return null;
    }

    @Override
    public Departement retrieveDepartement(Integer idDepart) {
        return null;
    }

    @Override
    public void assignUniversiteToDepartement(Long idUniversite, Long departementId) {
        try {
            Departement departement = departementRepo.findById(departementId).orElse(null);
            Universite universite = universiteRepo.findById(idUniversite).orElse(null);
            if (universite.getDepartements() == null) {
                List<Departement> departments = new ArrayList<>();
                departments.add(departement);
                universite.setDepartements(departments);

            } else {
                universite.getDepartements().add(departement);
            }
            universiteRepo.save(universite);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Error >>>" + e);
        }


    }

}

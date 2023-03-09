package tn.esprit.kaddem.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.kaddem.DAO.Entities.Departement;
import tn.esprit.kaddem.DAO.Entities.Etudiant;
import tn.esprit.kaddem.DAO.Entities.Universite;
import tn.esprit.kaddem.DAO.Repositories.DepartementRepo;
import tn.esprit.kaddem.DAO.Repositories.EtudiantRepo;
import tn.esprit.kaddem.DAO.Repositories.UniversiteRepo;

import java.util.List;


@Service
public class UniversiteService implements IUniversiteService {
    @Autowired
    private UniversiteRepo universiteRepo;
    @Autowired
    private DepartementRepo departementRepo;


    @Override
    public List<Universite> retrieveAllUniversites() {
        return null;
    }

    @Override
    public Universite addUniversite(Universite u) {
        return null;
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return null;
    }

    @Override
    public Universite retrieveUniversite(Integer idUniversite) {
        return null;
    }


}

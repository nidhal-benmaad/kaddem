package tn.esprit.kaddem.Services;

import tn.esprit.kaddem.DAO.Entities.Etudiant;
import tn.esprit.kaddem.DAO.Entities.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversites();
    Universite addUniversite (Universite u);
    Universite updateUniversite (Universite u);
    Universite retrieveUniversite (Integer idUniversite);

}

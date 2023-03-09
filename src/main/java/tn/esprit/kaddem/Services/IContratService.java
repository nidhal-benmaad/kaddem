package tn.esprit.kaddem.Services;

import tn.esprit.kaddem.DAO.Entities.Contrat;
import tn.esprit.kaddem.DAO.Entities.Specialite;

import java.util.Date;
import java.util.List;

public interface IContratService {
    List<Contrat> retrieveAllContrats();

    List<Contrat> getContratsBySpecialite(Specialite specialite);

    List<Contrat> getContratsByArchive(boolean arch);

    List<Contrat> getContratsByDate(Date date);
    Contrat updateContrat (Contrat ce);
    Contrat addContrat (Contrat ce);
    Contrat retrieveContrat (Long idContrat);
    void removeContrat(Long idContrat);
}

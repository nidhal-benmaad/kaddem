package tn.esprit.kaddem.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.kaddem.DAO.Entities.Contrat;
import tn.esprit.kaddem.DAO.Entities.Specialite;
import tn.esprit.kaddem.DAO.Repositories.ContactRepo;

import java.util.Date;
import java.util.List;


@Service
public class ContratService implements IContratService {
    @Autowired
    private ContactRepo contratRepo;

    @Override
    public List<Contrat> retrieveAllContrats() {
        return (List<Contrat>) contratRepo.findAll();
    }

    @Override
    public List<Contrat> getContratsBySpecialite(Specialite sp) {
        return contratRepo.getContratsBySpecialite(sp);
    }

    @Override
    public List<Contrat> getContratsByArchive(boolean arch) {
        return contratRepo.filterByArchive(arch);
    }

    @Override
    public List<Contrat> getContratsByDate(Date date) {
        return contratRepo.getContratsBetweenDates(date);
    }

    @Override
    public Contrat updateContrat(Contrat ce) {
        return contratRepo.save(ce);
    }

    @Override
    public Contrat addContrat(Contrat ce) {
        return contratRepo.save(ce);
    }

    @Override
    public Contrat retrieveContrat(Long idContrat) {
        return contratRepo.findById(idContrat).get();
    }

    @Override
    public void removeContrat(Long idContrat) {
        contratRepo.deleteById(idContrat);
    }
}

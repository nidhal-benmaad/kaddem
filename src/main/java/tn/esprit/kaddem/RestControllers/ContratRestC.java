package tn.esprit.kaddem.RestControllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.kaddem.DAO.Entities.Contrat;
import tn.esprit.kaddem.DAO.Entities.Etudiant;
import tn.esprit.kaddem.DAO.Entities.Specialite;
import tn.esprit.kaddem.Services.IContratService;
import tn.esprit.kaddem.Services.IEtudiantService;

import java.util.Date;
import java.util.List;

@Slf4j

@RestController
@RequestMapping("contrats")
public class ContratRestC {
    @Autowired
    private IContratService ics;

    @Autowired
    private IEtudiantService IEtudService;

    @GetMapping("get")
    List<Contrat> getAllContrats() {
        return ics.retrieveAllContrats();
    }

    @GetMapping("getBy")
    List<Contrat> getContratsBySpecialite(@RequestParam(value = "specialite") Specialite sp) {
        log.info("specialite >>>" + sp);
        return ics.getContratsBySpecialite(sp);
    }

    @GetMapping("filter")
    List<Contrat> getContratsBySpecialite(@RequestParam(value = "date") Date date) {
        return ics.getContratsByDate(date);
    }
   /* List<Contrat> getContratsBySpecialite(@RequestParam(value = "archive") boolean archive) {
        log.info("archive >>>" + archive);
        return ics.getContratsByArchive(archive);
    }*/

    @PostMapping("add")
    Contrat addContrat(@RequestBody Contrat c) {
        return ics.addContrat(c);
    }

    @PostMapping("addEtudiant")
    Etudiant addEtudiant(@RequestBody Etudiant e) {
        return IEtudService.addEtudiant(e);
    }

    @PutMapping("update")
    Contrat updateContrat(@RequestBody Contrat c) {
        return ics.updateContrat(c);
    }

    @DeleteMapping("delete/{id}")
    void deleteContrat(@PathVariable Long id) {
        ics.removeContrat(id);
    }

    @PostMapping("assignEtudiantToDepartement")
    void assignEtudiantToDepartement(@RequestParam(value = "etudiantId")Long etudiantId,
                                     @RequestParam(value = "departementId") Long departementId) {
        IEtudService.assignEtudiantToDepartement(etudiantId,departementId);
    }
}

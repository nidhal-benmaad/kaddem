package tn.esprit.kaddem.RestControllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.kaddem.DAO.Entities.Contrat;
import tn.esprit.kaddem.DAO.Entities.Departement;
import tn.esprit.kaddem.DAO.Entities.Specialite;
import tn.esprit.kaddem.Services.IContratService;
import tn.esprit.kaddem.Services.IDepartementService;
import tn.esprit.kaddem.Services.IEtudiantService;

import java.util.Date;
import java.util.List;

@Slf4j

@RestController
@RequestMapping("departements")
public class DepartementRestC {
    @Autowired
    private IDepartementService ids;

    @PostMapping("add")
    Departement addDepartement(@RequestBody Departement d) {
        return ids.addDepartement(d);
    }

    @PostMapping("assignUniversiteToDepartement")
    void assignUniversiteToDepartement(@RequestParam(value = "universiteId")Long idUniversite,
                                     @RequestParam(value = "departementId") Long departementId) {
        ids.assignUniversiteToDepartement(idUniversite,departementId);
    }
}

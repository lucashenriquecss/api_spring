package luca.dev.api.controller;

import jakarta.validation.Valid;
import luca.dev.api.medic.DataCreateMedic;
import luca.dev.api.medic.Medic;
import luca.dev.api.medic.MedicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medics")
public class MedicController {

    @Autowired
    private MedicRepository repository;



    @PostMapping
    @Transactional
    public void createMedic(@RequestBody @Valid DataCreateMedic body){
        repository.save(new Medic(body));
    }
}

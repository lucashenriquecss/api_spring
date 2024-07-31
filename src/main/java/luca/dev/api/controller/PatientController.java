package luca.dev.api.controller;

import jakarta.validation.Valid;
import luca.dev.api.medic.DataCreateMedic;
import luca.dev.api.patients.DataCreatePatient;
import luca.dev.api.patients.PatientRepository;
import luca.dev.api.patients.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("patients")
public class PatientController {
    @Autowired
    private PatientRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DataCreatePatient body) {
        repository.save(new Patients(body));
    }
}

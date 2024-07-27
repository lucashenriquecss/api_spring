package luca.dev.api.controller;

import luca.dev.api.medic.DataCreateMedic;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medics")
public class MedicController {

    @PostMapping
    public void createMedic(@RequestBody DataCreateMedic body){
        System.out.println(body);
    }
}

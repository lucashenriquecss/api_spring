package luca.dev.api.medic;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import luca.dev.api.address.Address;

@Table(name= "medics")
@Entity(name = "Medic")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String crm;
    @Enumerated(EnumType.STRING)
    private Specialty specialty;

    @Embedded
    private Address address;

    public Medic(DataCreateMedic body) {
        this.name = body.name();
        this.email = body.email();
        this.phone = body.phone();
        this.crm = body.crm();
        this.specialty = body.specialty();
        this.address = new Address(body.address());
    }
}

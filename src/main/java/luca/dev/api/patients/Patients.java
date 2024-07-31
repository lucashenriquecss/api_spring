package luca.dev.api.patients;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import luca.dev.api.address.Address;

@Table(name= "patients")
@Entity(name = "Patient")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Patients {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String cpf;
    private String phone;

    @Embedded
    private Address address;

    public Patients(DataCreatePatient body) {
        this.name = body.name();
        this.email = body.email();
        this.phone = body.phone();
        this.cpf = body.cpf();
        this.address = new Address(body.address());
    }
}

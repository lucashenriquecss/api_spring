package luca.dev.api.address;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String street;
    private String neighborhood;
    private String postalCode;
    private String city;
    private String region;
    private String number;
    private String complement;

    public Address(DataAddress address) {
        this.street = address.street();
        this.neighborhood = address.neighborhood();
        this.postalCode = address.postalCode();
        this.city = address.city();
        this.region = address.region();
        this.number = address.number();
        this.complement  = address.complement();
    }
}
